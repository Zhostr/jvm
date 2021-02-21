package com.luban.ziya.jvm;

/**
 * Created By 子牙老师
 * 2021/2/2
 */
public class TestThread implements Runnable {

    public static void main(String[] args) {
        new Thread(new TestThread()).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
