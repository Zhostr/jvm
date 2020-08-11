package com.luban.ziya.jvm;

public class Test {

    public static Test test4 = new Test();

    public static void main(String[] args) {
        Test demo = new Test();

        while (true);

//        System.out.println(demo.add());
    }

    public int add() {
        int a = 10;
        int b = 20;

        return a + b;
    }
}