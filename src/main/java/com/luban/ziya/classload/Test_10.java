package com.luban.ziya.classload;

public class Test_10 {
    public static void main(String[] args) {
        System.out.printf(Test_10_B.str);
//        System.out.println(Test_10_A.str);
    }
}

class Test_10_A {
    public static String str = "A str";

    static {
        System.out.println("A Static Block");
    }
}

class Test_10_B extends Test_10_A {
    static {
        str += "#11";

        System.out.println("B Static Block");
    }
}