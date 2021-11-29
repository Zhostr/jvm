package com.zest.classloader;

import java.io.*;

/**
 *  结果：
 *      class ziya.classloader.Classloader_1_A
 *      sun.misc.Launcher$AppClassLoader@14dad5dc
 *
 *  没有走我们自定义的类加载器，为什么呢？
 *  因为双亲委派模型，自定义类加载器的父类能够加载到这个类
 */
public class Classloader_1 extends ClassLoader {

    public static void main(String[] args) {
        Classloader_1 classloader = new Classloader_1();

        try {
            // -classpath /……/Users/zhoust/IdeaProjects/my-code/jvm/base-research/target/classes:/xxxxxx/jol-core-0.10.jar com.zest.classloader.Classloader_1
            // 由 AppClassLoader 负责加载 -classpath 中指定的 jar/classes 中的类
            Class<?> clazz = classloader.loadClass(Classloader_1_A.class.getName());

            System.out.println(clazz.getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static final String SUFFIX = ".class";

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        System.out.println("Classloader_1 findClass");

        byte[] data = getData(className.replace('.', '/'));

        return defineClass(className, data, 0, data.length);
    }

    private byte[] getData(String name) {
        System.out.println("getData(String name) 方法入参 name = " + name);
        InputStream inputStream = null;
        ByteArrayOutputStream outputStream = null;

        File file = new File(name + SUFFIX);
        if (!file.exists()) return null;

        try {
            inputStream = new FileInputStream(file);
            outputStream = new ByteArrayOutputStream();

            int size = 0;
            byte[] buffer = new byte[1024];

            while ((size = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, size);
            }

            return outputStream.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return null;
    }
}

class Classloader_1_A {

}