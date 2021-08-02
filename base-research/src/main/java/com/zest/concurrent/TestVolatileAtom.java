package com.zest.concurrent;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试volatile、原子性、synchronized
 */
public class TestVolatileAtom {

    public static volatile int i = 0;

    public static void incVal() {
        synchronized (TestVolatileAtom.class) {
            i++;
        }
    }

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<Thread>();

        for (int j = 0; j < 20; j++) {
            threads.add(new Thread(new Runnable() {
                public void run() {
                    for (int k = 0; k < 1000; k++) {
                        incVal();
                    }
                }
            }));

            threads.get(j).start();
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
