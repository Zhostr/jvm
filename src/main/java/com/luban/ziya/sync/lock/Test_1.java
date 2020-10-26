package com.luban.ziya.sync.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created By ziya
 * 2020/10/23
 */
public class Test_1 {

    static int tickets = 0;

    public static void main(String[] args) {
//        Thread t1 = new Thread(()->getTicket());
//        Thread t2 = new Thread(()->getTicket());
//        Thread t3 = new Thread(()->getTicket());
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//        try {
//            t1.join();
//            t2.join();
//            t3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("===== " + tickets + " =====");

        System.out.println(Test_1.class instanceof Object);
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
