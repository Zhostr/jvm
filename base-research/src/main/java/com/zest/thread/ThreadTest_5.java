package com.zest.thread;

import org.openjdk.jol.info.ClassLayout;

public class ThreadTest_5 {

    static int val = 0;

    public static void main(String[] args) {
//        System.out.println(ThreadTest_5.class instanceof Object);

        Object obj = new Object();
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
    }

    static void count() {
        for (int j = 0; j < 10000; j++) {
            val++;
        }
    }
}
