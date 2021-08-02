package com.zest.jvm;

public class Test {

    public static void main(String[] args) {
        Test obj = new Test();

        System.out.println(obj.add());
    }

    public int add() {
        int a = 10;
        int b = 20;

        return a + b;
    }

    public void show() {
        double v1 = 10;
        double v2 = 20;

        System.out.println(v1 + v2);
    }
}