package com.zest.sync.hashcode;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created By ziya
 * 2020/10/21
 */
public class Test_4 {

    public static void main(String[] args) {
        Test_4 obj = new Test_4();

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        synchronized (obj) {
            System.out.println(ClassLayout.parseInstance(obj).toPrintable());

            obj.hashCode();

            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        }
    }

}
