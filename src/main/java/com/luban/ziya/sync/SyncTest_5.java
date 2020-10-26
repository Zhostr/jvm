package com.luban.ziya.sync;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/9/14
 */
public class SyncTest_5 {

    public static void main(String[] args) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SyncTest_5 obj = new SyncTest_5();

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        while (true);
    }
}
