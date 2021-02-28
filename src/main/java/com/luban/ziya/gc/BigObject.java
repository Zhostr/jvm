package com.luban.ziya.gc;

/**
 * Created By ziya
 * 2020/11/24
 */
public class BigObject {

    private static final int _1MB = 1024 * 1024;
    /**
     * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
     */
    public static void main(String[] args) {
        byte[] allocation;
        allocation = new byte[4 * _1MB];
    }
}
