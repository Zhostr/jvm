package com.luban.ziya.string;

/**
 * Created By ziya
 * 2020/8/9
 */
public class TestHashcode {

    public static void main(String[] args) {
        String s2 = new String("11");
        String s3 = new String("11");
        String s1 = "11";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // 比较的是什么
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}