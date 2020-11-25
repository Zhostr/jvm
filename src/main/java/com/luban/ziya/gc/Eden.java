package com.luban.ziya.gc;

/**
 * Created By ziya
 * 2020/11/24
 */
public class Eden {

    private static final int _1MB = 1024 * 1024;

    /**
     * 《深度理解JVM》P130
     * -verbose:gc  -Xms20M  -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB]; // first gc
    }
}
