package com.luban.ziya.string;

/**
 * Created By 子牙老师
 * 2021/3/3
 *
 * 测试不可变性
 */
public class StringNoChange_4 {

    public static void main(String[] args) {
        String s1 = "ziya";
        String s2 = "ziya";

        System.out.println(s1 == s2);
    }
}
