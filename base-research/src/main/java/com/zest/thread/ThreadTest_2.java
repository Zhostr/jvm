package com.zest.thread;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest_2 {

    static int val = 0;

    static ReentrantLock lock = new ReentrantLock(true);

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

    static void count() {
        try {
            lock.lock();

            for (int j = 0; j < 10000; j++) {
                val++;

                val = val / 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
