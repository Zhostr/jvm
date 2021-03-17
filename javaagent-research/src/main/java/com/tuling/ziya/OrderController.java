package com.tuling.ziya;

import java.util.concurrent.TimeUnit;

/**
 * Created By 子牙老师
 * 2021/3/16
 */
public class OrderController {

    public void pay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("OrderController->pay");
    }
}
