package com.luban.ziya.sc.serialize.impl;

import com.luban.ziya.sc.serialize.ISerialize;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.runtime.RuntimeSchema;

import java.io.*;

/**
 * Created By ziya
 * 2020/12/19
 */
public class ProtobufSerialize_1 implements ISerialize {

    private RuntimeSchema schema;

    public ProtobufSerialize_1(Class clazz) {
        schema = RuntimeSchema.createFrom(clazz);
    }

    public <T> byte[] serialize(T obj) {
        byte[] bytes = ProtostuffIOUtil.toByteArray(obj, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));

        File file = new File("protobuff");
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);

            fileOutputStream.write(bytes);

            return bytes;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fileOutputStream) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    public <T> T deSerialize(byte[] data) {
        T o = (T) schema.newMessage();

        File file = new File("protobuff");

        byte bytes[] = new byte[8];
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);

            fileInputStream.read(bytes);

            System.out.println("=====");

            for (int i = 0; i < bytes.length; i++) {
                System.out.print(Integer.toHexString(bytes[i]) + " ");
            }

            System.out.println("");

            System.out.println("=>" + bytes.length);
            System.out.println("=====");

            ProtostuffIOUtil.mergeFrom(bytes, o, schema);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return o;
    }

    public <T> T deSerialize(byte[] data, Class clazz) {
        return null;
    }
}
