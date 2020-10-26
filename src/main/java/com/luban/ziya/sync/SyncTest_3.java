package com.luban.ziya.sync;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created By ziya
 * 2020/9/14
 */
public class SyncTest_3 {

    static int val = 10;

    public static void main(String[] args) {
        Class clazz = SyncTest_3.class;

        System.out.println(ClassLayout.parseClass(clazz).toPrintable());

        while (true);
    }
}
