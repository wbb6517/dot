package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.EscapeUtil;

public class EscapeUtilTest {
    public static void main(String[] args) {
        String s = EscapeUtil.escapeXml("<dependency>\n" +
                "            <groupId>org.springframework.boot</groupId>\n" +
                "            <artifactId>spring-boot-starter-web</artifactId>\n" +
                "        </dependency>");

        String s1 = EscapeUtil.unescapeXml(s);

        String s2 = EscapeUtil.escapeHtml4("<dependency>\n" +
                "            <groupId>org.springframework.boot</groupId>\n" +
                "            <artifactId>spring-boot-starter-web</artifactId>\n" +
                "        </dependency>");
        String s3 = EscapeUtil.unescapeHtml4(s2);

        String s4 = EscapeUtil.escape("王犇犇");
        String s6 = EscapeUtil.escapeAll("7243850892347");
        String s5 = EscapeUtil.unescape(s4);
        String s7 = EscapeUtil.unescape(s6);
        String s8 = EscapeUtil.safeUnescape(s6);
        String s9 = EscapeUtil.safeUnescape(s);
    }
}
