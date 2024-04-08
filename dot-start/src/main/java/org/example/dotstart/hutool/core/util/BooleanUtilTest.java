package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.BooleanUtil;
import org.example.dotstart.lombok.BuilderExample;

public class BooleanUtilTest {
    public static void main(String[] args) {
        boolean b1 = BooleanUtil.negate(true);
        boolean b2 = BooleanUtil.negate(false);

        boolean aTrue = BooleanUtil.isTrue(true);
        boolean aTrue1 = BooleanUtil.isTrue(false);

        boolean aFalse = BooleanUtil.isFalse(true);
        boolean aFalse1 = BooleanUtil.isFalse(false);

        boolean aBoolean = BooleanUtil.toBoolean("√");
        boolean aBoolean1 = BooleanUtil.toBoolean("錯");

        Boolean booleanObject = BooleanUtil.toBooleanObject("√");
        Boolean booleanObject1 = BooleanUtil.toBooleanObject("錯");

        int anInt = BooleanUtil.toInt(true);
        Integer integer = BooleanUtil.toInteger(true);

        char aChar = BooleanUtil.toChar(true);
        Character character = BooleanUtil.toCharacter(true);

        byte aByte = BooleanUtil.toByte(true);
        Byte byteObj = BooleanUtil.toByteObj(true);

        long aLong = BooleanUtil.toLong(true);
        Long longObj = BooleanUtil.toLongObj(true);

        short aShort = BooleanUtil.toShort(true);
        Short shortObj = BooleanUtil.toShortObj(true);

        float aFloat = BooleanUtil.toFloat(true);
        Float floatObj = BooleanUtil.toFloatObj(true);

        double aDouble = BooleanUtil.toDouble(true);
        Double doubleObj = BooleanUtil.toDoubleObj(true);

        String stringTrueFalse = BooleanUtil.toStringTrueFalse(true);
        String stringOnOff = BooleanUtil.toStringOnOff(true);
        String stringYesNo = BooleanUtil.toStringYesNo(true);

        String string = BooleanUtil.toString(true, "√", "錯");
        String string1 = BooleanUtil.toString(true, "√", "錯", "錯誤");

        boolean and = BooleanUtil.and(true, true);
        Boolean b = BooleanUtil.andOfWrap(Boolean.TRUE, Boolean.TRUE, Boolean.FALSE);

        boolean or = BooleanUtil.or(true, false);
        Boolean b3 = BooleanUtil.orOfWrap(Boolean.TRUE, Boolean.TRUE, Boolean.FALSE);

        boolean xor = BooleanUtil.xor(true, false);
        Boolean b4 = BooleanUtil.xorOfWrap(Boolean.TRUE, Boolean.TRUE, Boolean.FALSE);

        boolean aBoolean2 = BooleanUtil.isBoolean(Boolean.class);
        boolean aBoolean3 = BooleanUtil.isBoolean(String.class);

    }
}
