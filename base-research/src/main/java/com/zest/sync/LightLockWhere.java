package com.zest.sync;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created By ziya
 * 2020/10/21
 */
public class LightLockWhere {

    public static void main(String[] args) {
        LightLockWhere obj = new LightLockWhere();

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        synchronized (obj) {
            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        }

        show();
    }

    public static void show() {
        System.out.println("hello");

        while (true);
    }

}