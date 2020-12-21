package com.luban.ziya.sc.serialize.impl;

import com.luban.ziya.sc.serialize.ISerialize;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * Created By ziya
 * 2020/12/19
 */
public class XmlSerialize implements ISerialize {

    XStream xStream = new XStream(new DomDriver());

    public <T> byte[] serialize(T obj) {
        return xStream.toXML(obj).getBytes();
    }

    public <T> T deSerialize(byte[] data) {
        return (T) xStream.fromXML(new String(data));
    }

    public <T> T deSerialize(byte[] data, Class clazz) {
        return null;
    }
}
