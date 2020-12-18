package com.luban.ziya.sync;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

public class Test_1 {

    public static void main(String[] args) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Object object = new Object();

        System.out.println(ClassLayout.parseInstance(object).toPrintable());
    }
}
