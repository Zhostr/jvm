package com.zest.jni.source;

/**
 * Created By ziya
 * 2020/12/28
 */
public class JNIHandleBlock {

    public static void main(String[] args) {
        System.loadLibrary("jni");

        printAll();
    }

    public static native void printAll();
}
