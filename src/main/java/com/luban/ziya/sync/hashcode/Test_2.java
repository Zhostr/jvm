package com.luban.ziya.sync.hashcode;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/10/21
 */
public class Test_2 {

    public static void main(String[] args) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Test_2 obj = new Test_2();

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        obj.hashCode();

        synchronized (obj) {
            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        }
    }

}
