package com.zest.string;

/**
 * Created By 子牙老师
 * 2021/3/3
 *
 * -XX:+UseG1GC -XX:+UseStringDeduplication
 *
 * 测试去重
 */
public class StringDoWeight {

    public static void main(String[] args) throws InterruptedException {
        String s1 = new String("zi") + new String("ya");
        String s2 = "com/zest";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        //=====
        System.gc();

        Thread.sleep(100);

        System.gc();

        Thread.sleep(100);

        System.gc();

        Thread.sleep(100);

        System.gc();

        Thread.sleep(100);

        //=====
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
