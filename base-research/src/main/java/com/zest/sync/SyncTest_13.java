package com.zest.sync;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/9/14
 */
public class SyncTest_13 {

    static Object object = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(()->run(), "thread-1");
        Thread t2 = new Thread(()->run(), "thread-2");
        Thread t3 = new Thread(()->run(), "thread-3");

        t1.start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("===== end =====");
    }

    public static void run() {
        synchronized (object) {
            System.out.println(Thread.currentThread().getName() + "==>here");

            if (Thread.currentThread().getName().equals("thread-2")) {
                System.out.println(ClassLayout.parseInstance(object).toPrintable());

                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(ClassLayout.parseInstance(object).toPrintable());
            } else {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("===== here =====");
        }
    }
}
