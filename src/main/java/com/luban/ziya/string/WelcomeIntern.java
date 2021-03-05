package com.luban.ziya.string;

/**
 * Created By 子牙老师
 * 2021/3/3
 */
public class WelcomeIntern {

    public static void main(String[] args) {
        welcome();
    }

    public static void welcome() {
        String s1 = new String("zi") + new String("ya");

        s1.intern();

        String s2 = "ziya";

        System.out.println(s1 == s2);
    }
}
