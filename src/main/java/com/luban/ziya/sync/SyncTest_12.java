package com.luban.ziya.sync;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/9/14
 */
public class SyncTest_12 {

    public static void main(String[] args) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SyncTest_12 obj = new SyncTest_12();

        new Thread(() -> {
            synchronized (obj) {
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("===== " + Thread.currentThread().getName() + " =====");
                System.out.println(ClassLayout.parseInstance(obj).toPrintable());
            }
        }).start();

        //=====

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        synchronized (obj) {
            System.out.println("===== " + Thread.currentThread().getName() + " =====");
            System.out.println(ClassLayout.parseInstance(obj).toPrintable());

//            try {
//                obj.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
