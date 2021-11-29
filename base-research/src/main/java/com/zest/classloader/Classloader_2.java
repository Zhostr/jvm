package com.zest.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *      反射的底层原理
 *          forName
 *          getField
 *          getMethod
 *
 *      获取，知道如何存储
 *
 *      根类加载器的存储空间
 *      SystemDirectory  字典，就是一个 hashtable
 *          key         类的全限定名+类加载器->index
 *          value       Metadata：klass
 *
 */

public class Classloader_2 extends ClassLoader {

    public static void main(String[] args) throws ClassNotFoundException {
        Classloader_2 classloader1 = new Classloader_2();
        classloader1.setFilePath("~/IdeaProjects/my-code/jvm/base-research/target/classes");
        Class<?> clazz1 = classloader1.loadClass("com.zest.classloader.Classloader_1");
        System.out.println(clazz1.getClassLoader());

        //=====
//        Classloader_2 classloader2 = new Classloader_2();
//        classloader2.setFilePath("/home/ziya/IdeaProjects/luban-jvm-research/target/classes/");
//        Class<?> clazz2 = classloader2.loadClass("com.zest.classloader.Classloader_1");
//
//        System.out.println(clazz2.getClassLoader());
//        System.out.println(clazz1 == clazz2);
    }

    public static final String SUFFIX = ".class";

    public String filePath = "";

    public Classloader_2() {
        super();
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        System.out.println("findClass(String className) " + className);
        byte[] data = getData(className.replace('.', '/'));

        return defineClass(className, data, 0, data.length);
    }

    private byte[] getData(String name) {
        InputStream inputStream = null;
        ByteArrayOutputStream outputStream = null;

        File file = new File(filePath + name + SUFFIX);

        if (!file.exists()) return null;

        try {
            inputStream = new FileInputStream(file);
            outputStream = new ByteArrayOutputStream();

            int size = 0;
            byte[] buffer = new byte[1024];

            while ((size = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, size);
            }

            return outputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return null;
    }
}