package com.luban.ziya.sc.serialize.impl;

import com.luban.ziya.sc.serialize.ISerialize;

import java.io.*;

/**
 * Created By ziya
 * 2020/12/19
 */
public class JdkSerialize_1 implements ISerialize {

    public <T> byte[] serialize(T obj) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

            objectOutputStream.writeObject(obj);

            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != objectOutputStream) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null == byteArrayOutputStream) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    public <T> T deSerialize(byte[] data) {
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream  = null;

        byteArrayInputStream = new ByteArrayInputStream(data);

        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream);

            return (T) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != objectInputStream) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null == byteArrayInputStream) {
                try {
                    byteArrayInputStream.close();
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
