package org.example.dotstart.hutool.core.util;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.CharsetUtil;

import java.io.File;
import java.nio.charset.Charset;

public class CharsetUtilTest {
    public static void main(String[] args) {
        Charset charset1 = CharsetUtil.charset(CharsetUtil.UTF_8);
        Charset charset2 = CharsetUtil.charset(CharsetUtil.ISO_8859_1);
        Charset charset3 = CharsetUtil.charset(CharsetUtil.GBK);

        Charset parse1 = CharsetUtil.parse(CharsetUtil.UTF_8);
        Charset parse2 = CharsetUtil.parse(CharsetUtil.ISO_8859_1);
        Charset parse3 = CharsetUtil.parse(CharsetUtil.GBK);

        Charset parse4 = CharsetUtil.parse(CharsetUtil.UTF_8+"2",CharsetUtil.CHARSET_ISO_8859_1);
        Charset parse5 = CharsetUtil.parse(CharsetUtil.ISO_8859_1+"2",CharsetUtil.CHARSET_GBK);
        Charset parse6 = CharsetUtil.parse(CharsetUtil.GBK+"2",CharsetUtil.CHARSET_UTF_8);

        String asfdadfsadfsjafjsh = CharsetUtil.convert("asfdadfsadfsjafjsh", CharsetUtil.UTF_8, CharsetUtil.ISO_8859_1);
        String asfdadfsadfsjafjsh1 = CharsetUtil.convert("asfdadfsadfsjafjsh", CharsetUtil.CHARSET_GBK, CharsetUtil.CHARSET_UTF_8);
//        File convert = CharsetUtil.convert(FileUtil.file("src/main/resources/static/test.txt"), CharsetUtil.CHARSET_UTF_8, CharsetUtil.CHARSET_GBK);

        String s1 = CharsetUtil.systemCharsetName();
        Charset charset4 = CharsetUtil.systemCharset();

        String s2 = CharsetUtil.defaultCharsetName();
        Charset charset5 = CharsetUtil.defaultCharset();


    }
}
