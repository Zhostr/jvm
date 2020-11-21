package com.luban.ziya.adjust;

import org.openjdk.jol.info.ClassLayout;

public class CountSimpleObjectSize {

    int a = 10;

    static int[] arr = {0, 1, 2};

    int b = 10;

    public static void main(String[] args) {
        CountSimpleObjectSize test1 = new CountSimpleObjectSize();

        System.out.printf(ClassLayout.parseInstance(test1).toPrintable());
//        System.out.printf(ClassLayout.parseInstance(arr).toPrintable());
    }
}
