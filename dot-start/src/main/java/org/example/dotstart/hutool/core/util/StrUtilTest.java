package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.StrUtil;

import java.io.StringReader;
import java.io.StringWriter;

public class StrUtilTest {
    public static void main(String[] args) {
        boolean blankIfStr = StrUtil.isBlankIfStr(null);
        boolean isEmptyIfStr = StrUtil.isEmptyIfStr(null);
        String s = StrUtil.utf8Str(new StrUtilTest());

        StringBuilder builder = StrUtil.builder();
        StringBuilder builder1 = StrUtil.builder(64);

        StringReader test = StrUtil.getReader("test");
        StringWriter writer = StrUtil.getWriter();
        String test1 = StrUtil.reverse("test");
        String test2 = StrUtil.fillBefore("test",'5',6);
        String test3 = StrUtil.fillAfter("test",'5',6);

        StrUtil.format("test {}","test");




    }
}
