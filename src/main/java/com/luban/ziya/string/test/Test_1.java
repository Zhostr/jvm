package com.luban.ziya.string.test;

/**
 * Created By 子牙老师
 * 2021/3/2
 */
public class Test_1 {

    public static void main(String[] args) {
        String s = "11";

        String s1 = "1";
        String s2 = "1";
        String s3 = s1 + s2;

        System.out.println(s == s3);
        System.out.println(s.equals(s3));
    }

    public static void te() {
        String s1 = "ziya";   // char[] 4 * 2 = 8  浪费4B   byte[]  4 * 1 = 4
        String s2 = "子牙";   //  char[] 2 * 2 = 4          byte[]  不是存的问题，是取的问题

        int i = 0x11223344;
        byte b = 0x44;

        System.out.println();
    }

    public static void test() {
        String s1 = "ziya";
        String s2 = new String("ziya");

        String s3 = new String("子牙");
        String s4 = "子牙";
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
        String s1 = "1" + "1";

        String s2 = "1";
        String s3 = "1";
        String s4 = s2 + s3;

        // javac的编译优化
    }

    public static void test4() {
        String s1 = "1";
        String s2 = "1";

        String s3 = s1 + s2;
    }

    public static void test5() {
        final String s1 = "1";
        final String s2 = "1";

        String s3 = s1 + s2;
    }
}
