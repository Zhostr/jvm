package com.luban.ziya.string.test;

/**
 * Created By 子牙老师
 * 2021/3/2
 */
public class Test_1 {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        String s1 = "ziya";
        String s2 = new String("ziya");

        System.out.println(s1 == s2);
    }

    public static void test2() {
        String s2 = new String("ziya");
        String s1 = "ziya";

        System.out.println(s1 == s2);
    }

    public static void test3() {

    }
}
