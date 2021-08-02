package com.zest.utils;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * @description:
 * @author: Zest
 * @date: 2021/07/31 11:35 上午
 * @version: V1.0
 */
public interface SystemMethod {

    /**
     * 返回进程 id
     * @return
     */
    static int getProcessId() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        System.out.println(runtimeMXBean.getName());
        return Integer.parseInt(runtimeMXBean.getName().split("@")[0]);
    }

}