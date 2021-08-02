package com.zest.sync.hashcode;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/10/21
 */
public class Test_3 {

    public static void main(String[] args) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Test_3 obj = new Test_3();

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        synchronized (obj) {
            System.out.println(ClassLayout.parseInstance(obj).toPrintable());

            obj.hashCode();

            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        }
    }

}
