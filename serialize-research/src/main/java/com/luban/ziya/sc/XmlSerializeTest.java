package com.luban.ziya.sc;

import com.luban.ziya.sc.core.Hero;
import com.luban.ziya.sc.core.Teacher;
import com.luban.ziya.sc.serialize.ISerialize;
import com.luban.ziya.sc.serialize.impl.JdkSerialize;
import com.luban.ziya.sc.serialize.impl.XmlSerialize;

/**
 * Created By ziya
 * 2020/12/19
 */
public class XmlSerializeTest {

    public static void main(String[] args) {
        Hero hero = new Hero("ziya", 99);

        ISerialize serialize = new XmlSerialize();

        byte[] bytes = serialize.serialize(hero);

        System.out.println("=====");
        System.out.println(new String(bytes));
        System.out.println("=>" + bytes.length);
        System.out.println("=====");

        Hero obj = serialize.deSerialize(bytes);
        System.out.println(obj);
    }
}
