package com.luban.ziya.jni;

/**
 * Created By ziya
 * 2020/8/31
 */
public class App {

    public static void main(String[] args) {
        System.loadLibrary("jni");

        new MyThread().run0();
    }
}
