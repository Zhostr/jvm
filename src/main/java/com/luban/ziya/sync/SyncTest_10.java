package com.luban.ziya.sync;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/9/14
 */
public class SyncTest_10 {

    public static void main(String[] args) {
        SyncTest_10 obj1 = new SyncTest_10();

        System.out.println(ClassLayout.parseInstance(obj1).toPrintable());

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SyncTest_10 obj2 = new SyncTest_10();

        System.out.println(ClassLayout.parseInstance(obj2).toPrintable());
    }
}
