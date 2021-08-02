package com.zest.sync;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/9/14
 */
public class SyncTest_7 {

    static SyncTest_7 obj = new SyncTest_7();

    public static void main(String[] args) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
    }
}
