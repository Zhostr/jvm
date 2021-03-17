package com.tuling.ziya;

import javassist.*;

import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

/**
 * Created By 子牙老师
 * 2021/3/16
 */
public class Premain {

    public static void premain(String args, Instrumentation instrumentation) {
        System.out.println("Agent Premain");

        instrumentation.addTransformer(new ClassFileTransformer() {
            public byte[] transform(ClassLoader classLoader, String s, Class<?> aClass, ProtectionDomain protectionDomain, byte[] bytes) throws IllegalClassFormatException {
                // 注意：这里是斜杆，不是点
                if (!s.equals("com/tuling/ziya/OrderController")) {
                    return null;
                }

                //=====
                ClassPool classPool = new ClassPool();
                classPool.appendSystemPath();

                //=====
                try {
                    // 注意：这里是点，不是斜杆
                    CtClass clazz = classPool.get("com.tuling.ziya.OrderController");

                    CtMethod method = clazz.getDeclaredMethod("pay");

                    //=====
                    CtMethod newMethod = CtNewMethod.copy(method, clazz, null);
                    newMethod.setName("pay$0");

                    clazz.addMethod(newMethod);

                    /**
                     * 注意：
                     *  1、代码要用大括号括起来
                     *  2、每句代码后面的分号不能丢
                     */
                    StringBuilder body = new StringBuilder();
                    body.append("{ long start = System.currentTimeMillis();");
                    body.append("pay$0();");
                    body.append("System.out.println(\"方法执行时长: \" + (System.currentTimeMillis() - start)); }");

                    method.setBody(body.toString());

                    return clazz.toBytecode();
                } catch (NotFoundException e) {
                    e.printStackTrace();
                } catch (CannotCompileException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return null;
            }
        });
    }
}
