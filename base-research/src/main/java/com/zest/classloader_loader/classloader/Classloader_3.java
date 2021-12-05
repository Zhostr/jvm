package com.zest.classloader_loader.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Classloader_3 extends ClassLoader {

    public static void main(String[] args) throws ClassNotFoundException {
        Classloader_3 classloader1 = new Classloader_3();
        classloader1.setFilepath("~/IdeaProjects/my-code/jvm/");
        Class<?> clazz1 = classloader1.loadClass("com.zest.classloader_loader.classloader.Classloader_1");
        System.out.println("clazz1.getClassLoader() = " + clazz1.getClassLoader());
        System.out.println("clazz1 hashcode: " + clazz1.hashCode());

        Classloader_3 classloader2 = new Classloader_3();
        classloader2.setFilepath("/home/ziya/Documents/java-test/");
        Class<?> clazz2 = classloader2.loadClass("com.zest.classloader_loader.classloader.Classloader_1");
        System.out.println("clazz2.getClassLoader() = " + clazz2.getClassLoader());
        System.out.println("clazz2 hashcode: " + clazz2.hashCode());
    }

    public static final String SUFFIX = ".class";

    public String filepath = "";

    public Classloader_3() {
        super();
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        System.out.println("Classloader_2 findClass");
        byte[] data = getData(className.replace('.', '/'));

        // 解析字节码，构造 Class 对象
        return defineClass(className, data, 0, data.length);
    }

    private byte[] getData(String name) {
        InputStream inputStream = null;
        ByteArrayOutputStream outputStream = null;

        File file = new File(filepath + name + SUFFIX);

        System.out.println(filepath + name + SUFFIX);

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