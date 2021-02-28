package com.luban.ziya.classload;

public class Test_1 {
    public static void main(String[] args) {
        Test_1_Enum v = Test_1_Enum.V;

        System.out.printf(Test_1_B.str);
    }
}

class Test_1_A {
    public static String str = "A str";

    static {
        System.out.println("A Static Block");
    }
}

class Test_1_B extends Test_1_A {
    static {
        System.out.println("B Static Block");
    }
}

enum Test_1_Enum {
    V;

    static {
        System.out.println("Enum Static Block");
    }
}