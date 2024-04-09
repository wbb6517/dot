package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.DesensitizedUtil;
import cn.hutool.core.util.EnumUtil;

import java.awt.color.ICC_ColorSpace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EnumUtilTest {
    public static void main(String[] args) {
        boolean anEnum = EnumUtil.isEnum(DesensitizedUtil.DesensitizedType.class);
        String string = EnumUtil.toString(DesensitizedUtil.DesensitizedType.USER_ID);

        DesensitizedUtil.DesensitizedType enumAt = EnumUtil.getEnumAt(DesensitizedUtil.DesensitizedType.class, 1);
        DesensitizedUtil.DesensitizedType userId1 = EnumUtil.fromString(DesensitizedUtil.DesensitizedType.class, "USER_ID");
        DesensitizedUtil.DesensitizedType userId2 = EnumUtil.fromString(DesensitizedUtil.DesensitizedType.class, "USER_IDS", DesensitizedUtil.DesensitizedType.CHINESE_NAME);
        DesensitizedUtil.DesensitizedType userId3 = EnumUtil.fromStringQuietly(DesensitizedUtil.DesensitizedType.class, "USER_IDS");

//        DesensitizedUtil.DesensitizedType desensitizedType = EnumUtil.likeValueOf(DesensitizedUtil.DesensitizedType.class, "USER_ID");

        List<String> names = EnumUtil.getNames(DesensitizedUtil.DesensitizedType.class);
        List<Object> name = EnumUtil.getFieldValues(DesensitizedUtil.DesensitizedType.class, "USER_ID");
        List<String> name1 = EnumUtil.getFieldNames(DesensitizedUtil.DesensitizedType.class);
        DesensitizedUtil.DesensitizedType by = EnumUtil.getBy(DesensitizedUtil.DesensitizedType.class, Objects::nonNull);

        LinkedHashMap<String, DesensitizedUtil.DesensitizedType> enumMap = EnumUtil.getEnumMap(DesensitizedUtil.DesensitizedType.class);
        Map<String, Object> userIds = EnumUtil.getNameFieldMap(DesensitizedUtil.DesensitizedType.class, "USER_ID");
        boolean contains = EnumUtil.contains(DesensitizedUtil.DesensitizedType.class, "USER_ID");
        boolean contains1 = EnumUtil.notContains(DesensitizedUtil.DesensitizedType.class, "USER_ID");
        boolean contains2 = EnumUtil.equalsIgnoreCase(DesensitizedUtil.DesensitizedType.USER_ID, "USER_Ids");

        boolean equals = EnumUtil.equals(DesensitizedUtil.DesensitizedType.USER_ID, "USER_ID");

    }
}
