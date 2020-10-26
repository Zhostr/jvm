package com.luban.ziya.thread;

/**
 * Created By ziya
 * 2020/9/23
 */
public class SleepWaitTest_1 {

    public static SleepWaitTest_1 obj = new SleepWaitTest_1();



    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("上厕所没带纸，等...");

                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("纸来了，擦屁股走人...");
                }
            }
        }, "基友").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        Thread.sleep(1000);
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

                    obj.notify();
                }
            }
        }, "我").start();
    }


}
