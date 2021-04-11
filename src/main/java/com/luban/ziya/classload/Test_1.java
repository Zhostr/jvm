package com.luban.ziya.classload;

/**
 *
 * 加载阶段
 * 链接阶段
 *  验证阶段
 *  准备阶段
 *  解析阶段
 * 初始化阶段
 *
 *
 *  这几个阶段不是一气呵成的
 *  解析阶段一般由初始化阶段出发
 *      new
 *      getstatic
 *      pustatic
 *
 *
 * 解析阶段
 *
 *  间接引用->直接引用
 *
 *  间接引用：静态常量池的索引
 *  直接引用：内存地址
 *
 * 1、发生时机
        1、类加载以后马上解析  resolve=false
        2、使用的时候（下面这个）
 * 2、解析什么  只要是直接引用都需要解析
        1、继承的类、实现的接口
        2、属性
        3、方法
 * 3、如果避免重复解析
 *      借助缓存
 *
 *      ConstantPoolCache
 *          运行时常量池的缓存
 *
 *          hashtable
 *
 *      if(klass->is_resolved()) {
 *
 *      }
 *
 * 常量池缓存
 *  key         常量池的索引   2
 *  value       String->ConstantPoolCacheEntry
 *              klass
 *              method
 *
 * 静态属性是存储在堆区的
 *
 *  静态属性的访问：
 *  1、去缓存去找，如果由直接返回
 *  2、如果没有就触发解析
 *
 *  底层实现：
 *  1、会找到直接引用
 *  2、会存储到常量池缓存中
 *
 *
 *  sun/launcher/LauncherHelper
 *  checkAndLoadMain
 *
 *  klass模型的存储问题
 *      根类加载器
 *      扩展类加载器
 *      应用类加载器
 *
 *      方法区，元空间  meta space
 *
 */
public class Test_1 {
    public static void main(String[] args) {
        System.out.printf(Test_1_B.str);

        while (true);
    }
}

class Test_1_A {
    public static String str = "A str";

    static {
        System.out.println("A Static Block");
    }
}

class Test_1_B extends Test_1_A {
    static {
        System.out.println("B Static Block");
    }
}