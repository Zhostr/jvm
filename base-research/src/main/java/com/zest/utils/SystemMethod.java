package com.zest.utils;

import sun.misc.Launcher;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.URL;
import java.util.StringJoiner;

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

    /**
     * BootstrapClassLoader 启动类加载器加载的路径
     * @return 跟 System.getProperty("sun.boot.class.path") 返回一样
     */
    static String showBootstrapLoadPath() {
        StringJoiner stringJoiner = new StringJoiner(",");
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urLs) {
            stringJoiner.add(url.toString());
        }
        return stringJoiner.toString();
    }

    /**
     * 返回 classpath 路径
     * @return
     */
    static String getClasspath() {
        return System.getProperty("java.class.path");
    }

}