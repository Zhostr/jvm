package com.luban.ziya.sc;

import com.luban.ziya.sc.core.Teacher;
import com.luban.ziya.sc.serialize.ISerialize;
import com.luban.ziya.sc.serialize.impl.JdkSerialize;

/**
 * Created By ziya
 * 2020/12/19
 */
public class JdkSerializeTest {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("ziya", 99);

        ISerialize serialize = new JdkSerialize();

        serialize.serialize(teacher);

        Teacher obj = serialize.deSerialize(null);
        System.out.println(obj);
    }
}
