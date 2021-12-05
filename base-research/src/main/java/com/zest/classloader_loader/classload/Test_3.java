package com.zest.classloader_loader.classload;

public class Test_3 {

    public static void main(String[] args) {
        System.out.printf(Test_3_B.str);
    }
}

class Test_3_A {
    public static String str = "A str";

    static {
        System.out.println("A Static Block");
    }
}

class Test_3_B extends Test_3_A {
    public static final String str = "B str";

    static {
        System.out.println("B Static Block");
    }
}