package com.luban.ziya.sync;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created By ziya
 * 2020/9/14
 */
public class SyncTest_2 {

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

    public synchronized static void run() {
        synchronized (SyncTest_2.class) {
            for (int i = 0; i < 10000; i++) {
                val++;
            }

            System.out.println(ClassLayout.parseClass(SyncTest_2.class).toPrintable());

            if (val > 10000) {
                val = val;
            }
        }
    }
}
