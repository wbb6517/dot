package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.SystemPropsUtil;

import java.util.Properties;

public class SystemPropsUtilTest {
    public static void main(String[] args) {
        String s = SystemPropsUtil.get("java.version");

        Properties props = SystemPropsUtil.getProps();
        SystemPropsUtil.set("java.version", null);
        Properties props1 = SystemPropsUtil.getProps();
    }
}
