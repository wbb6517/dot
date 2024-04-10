package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.HexUtil;

import java.awt.*;
import java.math.BigInteger;

public class HexUtilTest {
    public static void main(String[] args) {
        boolean test = HexUtil.isHexNumber("aaa");
        char[] chars = HexUtil.encodeHex("aaa".getBytes());
        char[] chars2 = HexUtil.encodeHex("aaa".getBytes(), false);
        char[] chars1 = HexUtil.encodeHex("aaa", CharsetUtil.CHARSET_UTF_8);

        String s = HexUtil.encodeHexStr("aaa".getBytes());
        String s2 = HexUtil.encodeHexStr("aaa");
        String s1 = HexUtil.encodeHexStr("aaa", CharsetUtil.CHARSET_UTF_8);
        String s3 = HexUtil.encodeHexStr("aaa".getBytes(), false);

        String s4 = HexUtil.decodeHexStr("aaa");
        String s5 = HexUtil.decodeHexStr("aaa", CharsetUtil.CHARSET_UTF_8);
        String s6 = HexUtil.decodeHexStr("aaa".toCharArray(), CharsetUtil.CHARSET_UTF_8);

        byte[] bytes = HexUtil.decodeHex("aaa");
        String s7 = HexUtil.encodeColor(Color.CYAN);
        String s8 = HexUtil.encodeColor(Color.CYAN,"0x");

        Color color = HexUtil.decodeColor("#00FFFF");
        String unicodeHex1 = HexUtil.toUnicodeHex(79890);
        String unicodeHex2 = HexUtil.toUnicodeHex('H');

        String hex1 = HexUtil.toHex(7787);
        int hex2 = HexUtil.hexToInt("7787");
        StringBuilder stringBuilder = new StringBuilder();
        HexUtil.appendHex(stringBuilder, (byte) 3,true);
        HexUtil.appendHex(stringBuilder, (byte) 'h',true);

        BigInteger bigInteger = HexUtil.toBigInteger("7787");

        String format = HexUtil.format("7787");
    }
}
