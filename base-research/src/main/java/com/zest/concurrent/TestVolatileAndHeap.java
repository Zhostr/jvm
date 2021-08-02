package com.zest.concurrent;

/**
 * volitile与堆内存
 */
public class TestVolatileAndHeap {

    public volatile boolean found = false;

    public static void main(String[] args) {
        final TestVolatileAndHeap demo = new TestVolatileAndHeap();

        new Thread(new Runnable() {
            public void run() {
                System.out.println("等基友送笔来...");

                while (!demo.found) {
                }

                System.out.println("笔来了，开始写字...");
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("基友找到笔了，送过去...");

                demo.found = true;
            }
        }).start();
    }
}
