package com.luban.ziya.sc.serialize.impl;

import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;
import com.luban.ziya.sc.serialize.ISerialize;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created By ziya
 * 2020/12/19
 */
public class Hissan2Serialize implements ISerialize {

    public <T> byte[] serialize(T obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HessianOutput hessianOutput = new HessianOutput(byteArrayOutputStream);

        try {
            hessianOutput.writeObject(obj);

            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new byte[0];
    }

    public <T> T deSerialize(byte[] data) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        HessianInput hessianInput = new HessianInput(byteArrayInputStream);

        try {
            return (T) hessianInput.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public <T> T deSerialize(byte[] data, Class clazz) {
        return null;
    }
}
