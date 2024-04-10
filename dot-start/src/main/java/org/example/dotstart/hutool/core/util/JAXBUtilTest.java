package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.JAXBUtil;
import lombok.Data;

/**
 * JAXBUtil jdk21不可用。报错
 */
public class JAXBUtilTest {
    public static void main(String[] args) {
        //创建一个bean
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        //将bean转为xml
        String xml = JAXBUtil.beanToXml(user);
        System.out.println(xml);
        //将xml转为bean
        User user1 = JAXBUtil.xmlToBean(xml, User.class);
        System.out.println(user1);
    }
    @Data
    //创建一个bean
    public static class User {
        private String name;
        private int age;
    }
}
