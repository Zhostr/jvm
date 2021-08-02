package com.zest.sync;

import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/9/14
 */
public class SyncTest_1 {

    static int val = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> run());
        Thread t2 = new Thread(() -> run());
        Thread t3 = new Thread(() -> run());

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(val);

        while (true);
    }

    public static void run() {
        for (int i = 0; i < 10000; i++) {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            val++;
        }
    }
}
