package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.URLUtil;

import java.net.URI;
import java.net.URL;

public class URLUtilTest {
    public static void main(String[] args) {
        URL url = URLUtil.url("http://hutool.cn");
        URI getStringURI = URLUtil.getStringURI("http://hutool.cn");
        URL toUrlForHttp = URLUtil.toUrlForHttp("http://hutool.cn");
        String encodeBlank = URLUtil.encodeBlank("http://hutool.cn/ jds金卡戴珊f");
        String encode = URLUtil.encode("http://hutool.cn/ jds金卡戴珊f");
        String getDataUriBase64 = URLUtil.getDataUriBase64("http://hutool.cn/ jds金卡戴珊f","image/png");
        String decode = URLUtil.decode(encodeBlank);
        URL getURL = URLUtil.getURL("http://hutool.cn");
    }
}
