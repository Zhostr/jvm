package com.zest.concurrent;

/**
 * 测试volatile、原子性
 */
public class TestVolatileAtom2 {

    public volatile static int i = 0;

    public static void incVal() {
        i++;
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];

        for (int j = 0; j < threads.length; j++) {
            threads[j] = new Thread(new Runnable() {
                public void run() {
                    for (int k = 0; k < 1000; k++) {
                        incVal();
                    }
                }
            });

            threads[j].start();
        }

        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(i);
    }
}
