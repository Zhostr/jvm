package com.zest.jdk;

import com.zest.share.vm.classfile.BootClassLoader;
import com.zest.share.vm.oops.InstanceKlass;
import com.zest.share.vm.oops.MethodInfo;
import com.zest.share.vm.prims.JavaNativeInterface;
import com.zest.share.vm.runtime.JavaThread;
import com.zest.share.vm.runtime.Threads;

public class Main {

    public static void main(String[] args) {
        startJVM();
    }

    public static void startJVM() {
        // 通过AppClassLoader加载main函数所在的类
        InstanceKlass mainKlass = BootClassLoader.loadMainKlass("com.ziya.jvm.example.HelloWorld");

        // 找到main方法
        MethodInfo mainMethod = JavaNativeInterface.getMethodID(mainKlass,"main", "([Ljava/lang/String;)V");

        // 创建线程
        JavaThread thread = new JavaThread();

        Threads.getThreadList().add(thread);
        Threads.setCurrentThread(thread);

        // 执行main方法
        JavaNativeInterface.callStaticMethod(mainMethod);
    }
}
