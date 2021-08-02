package com.zest.sync;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created By ziya
 * 2020/9/14
 */
public class SyncTest_8 {

    static SyncTest_8 obj = new SyncTest_8();

    public static void main(String[] args) {
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        synchronized (obj) {
            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        }
    }
}
