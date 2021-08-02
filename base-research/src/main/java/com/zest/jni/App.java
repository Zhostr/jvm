package com.zest.jni;

/**
 * Created By ziya
 * 2020/8/31
 */
public class App {

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.library.path"));

        System.loadLibrary("jni");

        new MyThread().run0();
    }
}
