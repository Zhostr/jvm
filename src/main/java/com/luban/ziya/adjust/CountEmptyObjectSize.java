package com.luban.ziya.adjust;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created By ziya
 * 2020/8/10
 */
public class CountEmptyObjectSize {

    public static void main(String[] args) {
//        CountEmptyObjectSize obj = new CountEmptyObjectSize();

//        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        Object obj = new Object();

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
    }
}
