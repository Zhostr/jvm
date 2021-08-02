package com.zest.sync.lock;

/**
 * Created By ziya
 * 2020/10/23
 */
public class Test_2 {

    static int tickets = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(()-> {
            synchronized (new Object()) {
                for (int i = 0; i < 10000; i++) {
                    tickets++;
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (new Object()) {
                for (int i = 0; i < 10000; i++) {
                    tickets++;
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("===== " + tickets + " =====");
    }
}
