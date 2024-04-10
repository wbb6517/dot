package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.JNDIUtil;

import javax.naming.InitialContext;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import java.util.HashMap;

public class JNDIUtilTest {
    public static void main(String[] args) {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("key", "value");
        InitialContext initialContext = JNDIUtil.createInitialContext(stringStringHashMap);
        InitialDirContext initialDirContext = JNDIUtil.createInitialDirContext(stringStringHashMap);
        Attributes attributes = JNDIUtil.getAttributes("dns:hutool.cn");
    }
}
