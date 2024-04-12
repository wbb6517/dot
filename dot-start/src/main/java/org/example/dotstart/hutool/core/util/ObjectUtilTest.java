package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.ObjectUtil;

public class ObjectUtilTest {
    public static void main(String[] args) {
        boolean equals = ObjectUtil.equals("a", "b");
        boolean equals1 = ObjectUtil.equal("a", "a");
        boolean equals2 = ObjectUtil.notEqual("a", "a");
        int length = ObjectUtil.length("ad");
        boolean contains = ObjectUtil.contains("ad","a");
        boolean isNull = ObjectUtil.isNull("ad");
        boolean isNotNull = ObjectUtil.isNotNull("ad");
        boolean isEmpty = ObjectUtil.isEmpty("ad");
        boolean isNotEmpty = ObjectUtil.isNotEmpty("ad");
        String s = ObjectUtil.defaultIfNull("ad", "a");
        String clone = ObjectUtil.clone("ad");
        String cloneIfPossible = ObjectUtil.cloneIfPossible("ad");
        String cloneByStream = ObjectUtil.cloneByStream("ad");
        byte[] ads = ObjectUtil.serialize("ad");

    }
}
