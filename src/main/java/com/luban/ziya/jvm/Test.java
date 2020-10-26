package com.luban.ziya.jvm;

public class Test {

    public static Test test4 = new Test();

    public static void main(String[] args) {
        Test obj = new Test();

        System.out.println(test4.add());
    }

    public int add() {
        int a = 10;
        int b = 20;

        return a + b;
    }
}