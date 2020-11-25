package com.luban.ziya.oom;

import java.util.ArrayList;
import java.util.List;

public class HeapOverFlowTest {

    int[] intArr = new int[10];

    public static void main(String[] args) {
        List<HeapOverFlowTest> objs = new ArrayList<HeapOverFlowTest>();

        for (;;) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            objs.add(new HeapOverFlowTest());
        }
    }
}
