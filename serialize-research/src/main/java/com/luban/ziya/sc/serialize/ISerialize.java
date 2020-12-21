package com.luban.ziya.sc.serialize;

/**
 * Created By ziya
 * 2020/12/18
 */
public interface ISerialize {

    public <T> byte[] serialize(T obj);

    public <T> T deSerialize(byte[] data);

    public <T> T deSerialize(byte[] data, Class clazz);

}