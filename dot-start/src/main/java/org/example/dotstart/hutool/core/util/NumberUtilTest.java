package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.NumberUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NumberUtilTest {
    public static void main(String[] args) {
        long factorial = NumberUtil.factorial(5);
        long sqrt = NumberUtil.sqrt(5);
        long processMultiple = NumberUtil.processMultiple(5,2);
        long divisor = NumberUtil.divisor(5,2);
        long multiple = NumberUtil.multiple(5,2);
        String getBinaryStr = NumberUtil.getBinaryStr(5);

        int compare = NumberUtil.compare(5,2);
        BigDecimal bigDecimal = NumberUtil.toBigDecimal(5);
        int i = NumberUtil.nullToZero(5);


    }

    private static void isNumberTest() {
        NumberUtil.isNumber("1.23");
        NumberUtil.isInteger("1.23");
        NumberUtil.isLong("1.23");
        NumberUtil.isDouble("1.23");
        NumberUtil.isPrimes(55);

        int[] ints = NumberUtil.generateRandomNumber(5, 10, 3);
        int[] ints1 = NumberUtil.range(5,10,2);
        ArrayList<Integer> objects = new ArrayList<>();
        Collection<Integer> integers = NumberUtil.appendRange(5, 10, objects);
    }

    private static void addTest() {
        BigDecimal add = NumberUtil.add( "4","5");
        BigDecimal sub = NumberUtil.sub( "4","5");
        BigDecimal mul = NumberUtil.mul( "4","5");
        BigDecimal div = NumberUtil.div( "4","5");
        BigDecimal div1 = NumberUtil.div( "4","3",3);
        BigDecimal div2 = NumberUtil.div( "4","3",3, RoundingMode.HALF_UP);

        BigDecimal round = NumberUtil.round("4.123456", 3);
        String roundStr = NumberUtil.roundStr("4.123456", 3);
        String roundStr1 = NumberUtil.roundStr("4.123456", 3, RoundingMode.HALF_UP);
        BigDecimal roundHalfEven = NumberUtil.roundHalfEven(4.123456, 3);
        BigDecimal roundDown = NumberUtil.roundDown(4.123456, 3);

        String s = NumberUtil.decimalFormat("#.##", 4.123456);
        String s2 = NumberUtil.decimalFormatMoney( 44444444.123456);
        String s1 = NumberUtil.formatPercent( 0.123456,2);
    }
}
