package com.luban.ziya.string;

/**
 * Created By 子牙老师
 * 2021/3/3
 *
 * 测试不可变性
 */
public class StringNoChange_3 {

    public static void main(String[] args) {
        String s1 = "java.lang.String";
        String s2 = s1.replace('.', '.');
        String s3 = s1.replace('.', '/');

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
