package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.DesensitizedUtil;
import cn.hutool.core.util.EnumUtil;
import cn.hutool.core.util.JdkUtil;

public class JdkUtilTest {
    public static void main(String[] args) {
        int jvmVersion = JdkUtil.JVM_VERSION;
        boolean isJdk8 = JdkUtil.IS_JDK8;
        boolean isAtLeastJdk17 = JdkUtil.IS_AT_LEAST_JDK17;
        boolean isAndroid = JdkUtil.IS_ANDROID;


    }
}
