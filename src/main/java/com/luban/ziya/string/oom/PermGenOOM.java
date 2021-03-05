package com.luban.ziya.string.oom;

/**
 * Created By 子牙老师
 * 2021/3/3
 */
public class PermGenOOM {

    public static void main(String[] args) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String.valueOf(i);
        }
    }
}
