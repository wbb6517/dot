package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.CharUtil;

public class CharUtilTest {
    public static void main(String[] args) {
        boolean a = CharUtil.isAscii('a');
        boolean a1 = CharUtil.isAsciiPrintable('a');
        boolean a2 = CharUtil.isAsciiControl('a');
        boolean a3 = CharUtil.isLetter('a');
        boolean a4 = CharUtil.isLetterUpper('a');
        boolean a5 = CharUtil.isLetterLower('a');
        boolean a6 = CharUtil.isNumber('a');
        boolean a7 = CharUtil.isHexChar('a');
        boolean a8 = CharUtil.isLetterOrNumber('a');
        String string = CharUtil.toString('a');
        boolean charClass = CharUtil.isCharClass(Character.class);
        boolean a9 = CharUtil.isChar('a');
        boolean a10 = CharUtil.isBlankChar('a');
        boolean blankChar = CharUtil.isBlankChar(5);
        boolean a11 = CharUtil.isEmoji('a');
        boolean fileSeparator = CharUtil.isFileSeparator('\\');
        boolean equals = CharUtil.equals('\\', '\\', true);
        int a12 = CharUtil.getType('a');
        int i = CharUtil.digit16('a');
        char a13 = CharUtil.toCloseChar('a');
        char closeByNumber = CharUtil.toCloseByNumber(2);


    }

}
