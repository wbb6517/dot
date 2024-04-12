package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.PrimitiveArrayUtil;

public class PrimitiveArrayUtilTest {
    public static void main(String[] args) {
        PrimitiveArrayUtil.isEmpty(new int[]{1, 2, 3});
        PrimitiveArrayUtil.isNotEmpty(new int[]{1, 2, 3});
        PrimitiveArrayUtil.resize(new byte[]{1, 2, 3},5);
        PrimitiveArrayUtil.addAll(new byte[]{1, 2, 3},new byte[]{4, 5, 6});
        int[] range = PrimitiveArrayUtil.range(1,3);
        PrimitiveArrayUtil.split(new byte[]{1, 2, 3},3);
        PrimitiveArrayUtil.indexOf(new long[]{1L, 2L, 3L},3);
        PrimitiveArrayUtil.lastIndexOf(new long[]{1L, 2L, 3L},3);
        PrimitiveArrayUtil.contains(new long[]{1L, 2L, 3L},3);
        PrimitiveArrayUtil.wrap(1,2,3);
        PrimitiveArrayUtil.unWrap(1,2,3);
        PrimitiveArrayUtil.sub(new byte[]{1, 2, 3},1,2);
        PrimitiveArrayUtil.remove(new byte[]{1, 2, 3},1);
        PrimitiveArrayUtil.removeEle(new int[]{1, 2, 3},1);
        PrimitiveArrayUtil.reverse(new int[]{1, 2, 3},1,2);
        PrimitiveArrayUtil.min(new int[]{1, 2, 3});
        PrimitiveArrayUtil.max(new int[]{1, 2, 3});
        PrimitiveArrayUtil.shuffle(new int[]{1, 2, 3});
        PrimitiveArrayUtil.swap(new int[]{1, 2, 3},0,1);
        PrimitiveArrayUtil.isSorted(new int[]{1, 2, 3});
        PrimitiveArrayUtil.isSortedASC(new int[]{1, 2, 3});
        PrimitiveArrayUtil.isSortedDESC(new int[]{1, 2, 3});
    }
}
