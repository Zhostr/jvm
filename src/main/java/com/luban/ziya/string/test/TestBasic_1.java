package com.luban.ziya.string.test;

/**
 * Created By 子牙老师
 * 2021/3/2
 */
public class TestBasic_1 {

    /**
     * 这三种创建字符串的方式，底层有啥不同
     */
    public static void main(String[] args) {
        String s1 = new String("ziya");
        String s2 = new String("zi") + new String("ya");
        String s3 = "zi" + "ya";
    }
}
