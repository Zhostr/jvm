package com.zest.sync;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/9/14
 */
public class SyncTest_9 {

    public static void main(String[] args) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SyncTest_9 obj = new SyncTest_9();

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        synchronized (obj) {
            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        }

        obj.hashCode();

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

    }
}
