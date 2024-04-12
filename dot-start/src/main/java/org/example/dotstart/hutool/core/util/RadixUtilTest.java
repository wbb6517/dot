package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.RadixUtil;

public class RadixUtilTest {
    public static void main(String[] args) {
        String encode = RadixUtil.encode("01", 7);
        String encode1 = RadixUtil.encode("01", 7);
        int decodeToInt = RadixUtil.decodeToInt("01", encode);
    }
}
