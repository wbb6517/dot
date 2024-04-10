package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.HashUtil;

import java.nio.charset.StandardCharsets;

public class HashUtilTest {
    public static void main(String[] args) {
        int i1 = HashUtil.additiveHash("test", 10);
        int i2 = HashUtil.rotatingHash("test", 10);
        int i3 = HashUtil.oneByOneHash("test");
        int i4 = HashUtil.bernstein("test");
//        int i5 = HashUtil.universal(new char[]{'t'},1,new int[]{1});
//        int i6 = HashUtil.zobrist(new char[]{'t'},1,new int[]{1});
        int i7 = HashUtil.fnvHash("test".getBytes());
        int i8 = HashUtil.fnvHash("test");
        int i9 = HashUtil.intHash(4);
        int i10 = HashUtil.rsHash("test");
        int i11 = HashUtil.jsHash("test");
        int i12 = HashUtil.pjwHash("test");
        HashUtil.elfHash("test");
        HashUtil.bkdrHash("test");
        HashUtil.sdbmHash("test");
        HashUtil.djbHash("test");
        HashUtil.dekHash("test");
        HashUtil.apHash("test");
        HashUtil.tianlHash("test");
        HashUtil.javaDefaultHash("test");
        HashUtil.mixHash("test");
        HashUtil.identityHashCode("test");
        byte[] bytes = "test".getBytes(StandardCharsets.UTF_8);
        int i = HashUtil.murmur32("test".getBytes(StandardCharsets.UTF_8));
        long l = HashUtil.murmur64("test".getBytes(StandardCharsets.UTF_8));
        long[] longs = HashUtil.murmur128("test".getBytes(StandardCharsets.UTF_8));
        HashUtil.cityHash32("test".getBytes(StandardCharsets.UTF_8));
        HashUtil.metroHash64("test".getBytes(StandardCharsets.UTF_8));
        long l1 = HashUtil.hfHash("test");
        long l2 = HashUtil.hfIpHash("test");


    }
}
