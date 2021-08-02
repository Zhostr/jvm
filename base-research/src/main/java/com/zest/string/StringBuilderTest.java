package com.zest.string;

/**
 * Created By 子牙老师
 * 2021/3/8
 */
public class StringBuilderTest {

    public static void main(String[] args) {
        t1();
        t2();
    }

    public static void t1() {
        String s1 = new StringBuilder("11").toString();
        s1.intern();
        String s2 = "11";

        String s = s2 + "hi";

        System.out.println(s1 == s2);
    }

    public static void t2() {
        String s1 = new StringBuilder("zi").append("zi").toString();
        s1.intern();
        String s2 = "zizi";

        System.out.println(s1 == s2);
    }
}
