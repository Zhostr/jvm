package com.luban.ziya.sync;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created By ziya
 * 2020/9/14
 */
public class SyncTest_15 {

    static SyncTest_15 obj = new SyncTest_15();

    public static void main(String[] args) {
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        synchronized (obj) {
            System.out.println(ClassLayout.parseInstance(obj).toPrintable());

            System.out.println(obj.hashCode());

            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        }
    }
}
