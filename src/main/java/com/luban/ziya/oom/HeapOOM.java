package com.luban.ziya.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By ziya
 * 2020/11/21
 */
public class HeapOOM {
    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
