package com.zest.sync.lock;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/10/23
 */
public class Test_1 {

    static int tickets = 0;

    public static void main(String[] args) {
        Test_1 obj = new Test_1();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
    }

    public synchronized static void getTicket() {
        for (int i = 0; i < 10000; i++) {
            tickets++;
        }
    }

    public void getTicket2() {
        synchronized (Object.class) {
            for (int i = 0; i < 10000; i++) {
                tickets++;
            }
        }
    }
}
