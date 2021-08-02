package com.zest.thread;

/**
 *  这个程序是线程安全的吗
 *
 *  研究join的底层实现
 */

public class ThreadTest_1 {

    static int val = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < 10000000; j++) {
                    val++;
                }
            });

            t.start();

            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(val);
    }
}
