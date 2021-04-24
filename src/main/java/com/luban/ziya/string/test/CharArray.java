package com.luban.ziya.string.test;

/**
 * Created By ziya
 * 2020/7/29
 */
public class CharArray {

    public static void main(String[] args) {
        char[] arr = new char[]{'1', '2', '3'};

        change(arr);

        System.out.println(arr[0]);

        while (true);
    }

    public static void change(char[] arr) {
        arr[0] = 'A';
    }
}
