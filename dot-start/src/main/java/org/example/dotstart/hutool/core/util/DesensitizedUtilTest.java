package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.DesensitizedUtil;

public class DesensitizedUtilTest {
    public static void main(String[] args) {

        String desensitized1 = DesensitizedUtil.desensitized("321785985312", DesensitizedUtil.DesensitizedType.USER_ID);
        String desensitized2 = DesensitizedUtil.desensitized("张三丰", DesensitizedUtil.DesensitizedType.CHINESE_NAME);


        String clear = DesensitizedUtil.clear();
        String s = DesensitizedUtil.clearToNull();
        Long l = DesensitizedUtil.userId();


        String s1 = DesensitizedUtil.firstMask("aksdfj");
        String s2 = DesensitizedUtil.chineseName("王犇犇");
        String s3 = DesensitizedUtil.idCardNum("320322200004128923",3,1);
        String s4 = DesensitizedUtil.fixedPhone("320322200004128923");
        String s5 = DesensitizedUtil.mobilePhone("13277777777");
        String s6 = DesensitizedUtil.address("13277777777",3);
        String s7 = DesensitizedUtil.email("13277777@777");
        String s8 = DesensitizedUtil.password("13277777@777");
        String s9 = DesensitizedUtil.carLicense("苏D40000");
        String s10 = DesensitizedUtil.bankCard("1234 2222 3333 4444 6789 9");
        String s11 = DesensitizedUtil.ipv4("192.0.2.1");
        String s12 = DesensitizedUtil.ipv6("2001:0db8:86a3:08d3:1319:8a2e:0370:7344");

    }
}
