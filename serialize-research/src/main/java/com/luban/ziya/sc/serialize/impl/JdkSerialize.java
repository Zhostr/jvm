package com.luban.ziya.sc.serialize.impl;

import com.luban.ziya.sc.serialize.ISerialize;

import java.io.*;

/**
 * Created By ziya
 * 2020/12/19
 */
public class JdkSerialize implements ISerialize {

    public <T> byte[] serialize(T obj) {
        File file = new File("serialize");

        ObjectOutputStream outputStream = null;

        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(file));

            outputStream.writeObject(obj);

            System.out.println("write success");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != outputStream) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    public <T> T deSerialize(byte[] data) {
        File file = new File("serialize");

        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream(new FileInputStream(file));

            return (T) inputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null == inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    public <T> T deSerialize(byte[] data, Class clazz) {
        return null;
    }
}
