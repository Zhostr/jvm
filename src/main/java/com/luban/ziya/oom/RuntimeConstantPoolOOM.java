package com.luban.ziya.oom;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By ziya
 * 2020/11/21
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
       /* // 使用set保持着常量池引用，避免full gc回收常量池行为
        Set<String> set = new HashSet<String>();
        // 在short范围内足以让6MB的PermSize产生OOM
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }*/

        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ne").append("w").toString();
        System.out.println(str2.intern() == str2);
    }
}
