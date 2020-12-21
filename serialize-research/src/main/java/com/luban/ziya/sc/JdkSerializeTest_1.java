package com.luban.ziya.sc;

import com.luban.ziya.sc.core.Teacher;
import com.luban.ziya.sc.serialize.ISerialize;
import com.luban.ziya.sc.serialize.impl.JdkSerialize_1;

/**
 * Created By ziya
 * 2020/12/19
 */
public class JdkSerializeTest_1 {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("ziya", 99);

        ISerialize serialize = new JdkSerialize_1();

        byte[] bytes = serialize.serialize(teacher);

        System.out.println((Teacher) serialize.deSerialize(bytes));
    }
}