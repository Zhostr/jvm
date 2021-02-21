package com.luban.ziya.classload;

public class Test_4 {

    public static void main(String[] args) {
        Test_4_A arrs[] = new Test_4_A[1];

        System.out.println("end");
    }
}

class Test_4_A {
    static {
        System.out.println("Test_4_A Static Block");
    }
}
