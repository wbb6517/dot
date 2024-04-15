package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.ReUtil;

public class ReUtilTest {
    public static void main(String[] args) {
        String group0 = ReUtil.getGroup0("/(?:http|ftp):\\/\\/([^/\\r\\n]+)(\\/[^\\r\\n]*)?/", "http://google.com/");
        String group1 = ReUtil.getGroup1("/(0~255).(0~255).(0~255).(0~255)/", "192.168.0.1");
        String extractMulti = ReUtil.extractMulti("(.*?) 年(.*?) 月", "2013年5月","$1-$2");

    }
}
