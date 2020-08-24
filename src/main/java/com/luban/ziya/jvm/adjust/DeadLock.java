package com.luban.ziya.jvm.adjust;

public class DeadLock {

    public static final Object obj1 = new Object();
    public static final Object obj2 = new Object();

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj1) {
                    System.out.println("thread-1 DeadLock obj1");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (obj2) {
                        System.out.println("thread-1 DeadLock obj2");

                    }
                }
            }
        }, "thread-1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj2) {
                    System.out.println("thread-2 DeadLock obj2");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (obj1) {
                        System.out.println("thread-2 DeadLock obj1");


                    }
                }
            }
        }, "thread-2").start();
    }
}
