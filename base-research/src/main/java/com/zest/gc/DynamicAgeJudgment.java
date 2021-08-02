package com.zest.gc;

/**
 * Created By ziya
 * 2020/11/24
 */
public class DynamicAgeJudgment {
    private static final int _1MB = 1024 * 1024;
    /**
     * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     * -XX:MaxTenuringThreshold=15 -XX:+PrintTenuringDistribution
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[_1MB / 4];
        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
        allocation4 = null;
        allocation4 = new byte[4 * _1MB];
    }
}
