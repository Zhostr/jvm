package com.luban.ziya.oom;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created By ziya
 * 2020/11/21
 */
public class DirectMemoryOOM {

    private static final int _10MB = 10 * 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);

        List<Long> list = new ArrayList<>();

        while (true) {
            list.add(unsafe.allocateMemory(_10MB));
        }
    }
}
