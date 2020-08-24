package com.luban.ziya.jvm.adjust;

public class CPUHigh {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("hi");
                }
            }
        }, "thread-cpuhigh").start();
    }
}
