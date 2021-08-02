package com.zest.sync.hashcode;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created By ziya
 * 2020/10/21
 */
public class Test_1 {

    public static void main(String[] args) {
        Test_1 obj = new Test_1();

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

//        obj.hashCode();

        synchronized (obj) {
            obj.hashCode();

            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        }
    }

}