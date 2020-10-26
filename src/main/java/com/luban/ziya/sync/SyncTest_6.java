package com.luban.ziya.sync;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/9/14
 */
public class SyncTest_6 {

    public static void main(String[] args) {
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        SyncTest_6 obj = new SyncTest_6();

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        Thread t1 = new Thread(() -> {
            synchronized (obj) {
//                System.out.println(Thread.currentThread().getName());
                System.out.println(ClassLayout.parseInstance(obj).toPrintable());

                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (obj) {
//                System.out.println(Thread.currentThread().getName());
                System.out.println(ClassLayout.parseInstance(obj).toPrintable());
            }
        });

        t1.start();
//        t2.start();

        try {
            t1.join();
//            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("===== end =====");

//        while (true);
    }
}
