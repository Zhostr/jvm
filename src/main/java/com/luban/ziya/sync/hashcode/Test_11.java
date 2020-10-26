package com.luban.ziya.sync.hashcode;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created By ziya
 * 2020/10/21
 */
public class Test_11 {

    public static void main(String[] args) {
        Test_11 obj = new Test_11();

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        synchronized (obj) {
            System.out.println(ClassLayout.parseInstance(obj).toPrintable());

            synchronized (obj) {
                System.out.println(ClassLayout.parseInstance(obj).toPrintable());
            }
        }
    }

}
