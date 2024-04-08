package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.ByteUtil;

import java.nio.ByteOrder;


public class ByteUtilTest {
    public static void main(String[] args) {
        byte b1 = ByteUtil.intToByte(127);
        byte b2 = ByteUtil.intToByte(1257);

        int i = ByteUtil.byteToUnsignedInt((byte) 127);
        int i1 = ByteUtil.byteToUnsignedInt((byte) 1257);

        short i2 = ByteUtil.bytesToShort(new byte[]{1, 1});
        short i3 = ByteUtil.bytesToShort(new byte[]{1, 2}, ByteOrder.BIG_ENDIAN);
        short i4 = ByteUtil.bytesToShort(new byte[]{1, 2, 3}, 1, ByteOrder.BIG_ENDIAN);

        byte[] bytes1 = ByteUtil.shortToBytes((short) 257);
        byte[] bytes2 = ByteUtil.shortToBytes((short) 258);
        byte[] bytes3 = ByteUtil.shortToBytes((short) 515, ByteOrder.BIG_ENDIAN);

        int i5 = ByteUtil.bytesToInt(new byte[]{1, 1, 0, 0});
        int i6 = ByteUtil.bytesToInt(new byte[]{1, 2, 0, 0}, ByteOrder.BIG_ENDIAN);
        int i7 = ByteUtil.bytesToInt(new byte[]{1, 2, 3, 0,0,0}, 1, ByteOrder.BIG_ENDIAN);

        byte[] bytes4 = ByteUtil.intToBytes((short) 257);
        byte[] bytes5 = ByteUtil.intToBytes((short) 258);
        byte[] bytes6 = ByteUtil.intToBytes((short) 515, ByteOrder.BIG_ENDIAN);

        byte[] bytes = ByteUtil.numberToBytes(123456);
        Long l = ByteUtil.bytesToNumber(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, Long.class, ByteOrder.LITTLE_ENDIAN);
    }
}
