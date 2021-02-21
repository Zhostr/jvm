package com.luban.ziya.classload;

public class Test_8 {

    static {
        System.out.println("Test_8 Static Block");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.luban.ziya.classload.Test_8_A");

        System.out.println("end");
    }
}

class Test_8_A {
    static {
        System.out.println("Test_8_A Static Block");
    }
}