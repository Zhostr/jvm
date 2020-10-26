package com.luban.ziya.thread;

/**
 * Created By ziya
 * 2020/9/23
 */
public class SleepWaitTest_2 {

    public static SleepWaitTest_2 obj = new SleepWaitTest_2();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() + ": 上厕所没带纸，等...");

                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ": 纸来了，擦屁股走人...");
                }
            }
        }, "基友一").start();


        //=====
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() + ": 上厕所没带纸，等...");

                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ": 纸来了，擦屁股走人...");
                }
            }
        }, "基友二").start();


        //=====
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() + ": 上厕所没带纸，等...");

                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ": 纸来了，擦屁股走人...");
                }
            }
        }, "基友三").start();


        //=====
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("#到处找纸...");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("#找到纸了，送过去哦...");

                    // 会唤醒一个还是全部
                    obj.notifyAll();
                }
            }
        }, "我").start();
    }


}
