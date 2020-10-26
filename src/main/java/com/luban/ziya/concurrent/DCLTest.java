package com.luban.ziya.concurrent;

import java.util.ArrayList;
import java.util.List;

public class DCLTest {

    public static volatile DCLTest instance;

    public int a = 11;

    private DCLTest() {
        a++;
    }

    public static DCLTest getInstance() {
        if (null == instance) {
            synchronized (DCLTest.class) {
                if (null == instance) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    instance = new DCLTest();
                }
            }
        }

        return instance;
    }

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<Thread>();

        for (int j = 0; j < 100000; j++) {
            threads.add(new Thread(new Runnable() {
                public void run() {
                    System.out.println(getInstance().a);
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

        System.out.println("===== end =====");
    }
}
