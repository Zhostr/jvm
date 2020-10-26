package com.luban.ziya.sync.hashcode;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created By ziya
 * 2020/10/21
 */
public class Test_5 {

    public static void main(String[] args) {
        Test_5 obj = new Test_5();

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        synchronized (obj) {
            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        }

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

    }

}
