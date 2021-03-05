package com.luban.ziya.oom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created By ziya
 * 2020/11/21
 */
public class DirectMemoryOOM2 {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        List<ByteBuffer> list = new ArrayList<>();

        while (true) {
            ByteBuffer buffer = ByteBuffer.allocateDirect(_1MB);

            list.add(buffer);
        }
    }
}
