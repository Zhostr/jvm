package com.luban.ziya.debug;

/**
 * Created By ziya
 * QQ: 3039277701
 * 2021/4/8
 */
public class Hello {
    private int a = 10;
    public static final int v = 20;

    private static int c;
    private static int b = 20;

    static {
        System.out.println("#1");
    }

    static {
        System.out.println("#2");
    }

    public static void main(String[] args) {
        int[] intArr = new int[1];
        Hello[] objArr = new Hello[1];

//        Class clazz = Hello.class;

//        System.out.println("hello");

//        Hello obj = new Hello();

        while (true);
    }
}