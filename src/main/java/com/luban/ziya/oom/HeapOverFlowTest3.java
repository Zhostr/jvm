package com.luban.ziya.oom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HeapOverFlowTest3 {

    int[] intArr = new int[1024 * 1024]; // 1M + 16B   1000   1G

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            /**
             * 50   quick
             * 500  slow
             */
            TimeUnit.MILLISECONDS.sleep(50);

            run();
        }
    }

    public static void run() {
        List<HeapOverFlowTest3> objs = new ArrayList<>();

        objs.add(new HeapOverFlowTest3());
    }
}
