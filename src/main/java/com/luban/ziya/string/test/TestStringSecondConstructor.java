package com.luban.ziya.string.test;

/**
 * Created By ziya
 * 2020/7/27
 */
public class TestStringSecondConstructor {

    public static void main(String[] args) {
        String s1 = new String(new char[]{'1', '1'}, 0, 2);

//        s1.intern();

        String s2 = "11";

        System.out.println(s1 == s2);
    }
}
