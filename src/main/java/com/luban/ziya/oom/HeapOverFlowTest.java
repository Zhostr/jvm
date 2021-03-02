package com.luban.ziya.oom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HeapOverFlowTest {

    int[] intArr = new int[10 * 1024 * 1024];

    public static void main(String[] args) {
        List<HeapOverFlowTest> objs = new ArrayList<>();

        for (;;) {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            objs.add(new HeapOverFlowTest());
        }
    }
}
