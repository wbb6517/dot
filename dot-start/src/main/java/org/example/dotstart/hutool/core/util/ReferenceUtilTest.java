package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.ReferenceUtil;

import java.lang.ref.Reference;

public class ReferenceUtilTest {
    public static void main(String[] args) {
        Reference<String> stringReference = ReferenceUtil.create(ReferenceUtil.ReferenceType.PHANTOM, "666");
    }
}
