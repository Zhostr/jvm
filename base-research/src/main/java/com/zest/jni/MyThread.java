package com.zest.jni;

/**
 * Created By ziya
 * 2020/8/31
 */
public class MyThread {

    public native void run0();

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " say: " + i);
        }
    }

}
