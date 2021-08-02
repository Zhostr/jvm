package com.zest.concurrent;

/**
 * volitile与方法区
 */
public class TestVolatileAndMethodArea {

    public static volatile boolean found = false;

    public static void main(String[] args)  {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("等基友送笔来...");

                while (!found) {
                }

                System.out.println("笔来了，开始写字...");
            }
        }, "我线程").start();

        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("基友找到笔了，送过去...");

                change();
            }
        }, "基友线程").start();
    }

    public static void change() {
        found = true;
    }
}
