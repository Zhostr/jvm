package com.luban.ziya.thread;

public class ThreadTest_4 {

    static int val = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> count() );

        Thread t2 = new Thread(() -> count() );

        Thread t3 = new Thread(() -> count() );

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(val);
    }

    static synchronized void count() {
        for (int j = 0; j < 10000; j++) {
            val++;
        }
    }
}
