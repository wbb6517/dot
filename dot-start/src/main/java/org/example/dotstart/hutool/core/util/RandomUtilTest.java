package org.example.dotstart.hutool.core.util;


import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.WeightRandom;
import cn.hutool.core.util.RandomUtil;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtilTest {
    public static void main(String[] args) {


    }

    private static void randomChineseTest() {
        char c = RandomUtil.randomChinese();
        char c1 = RandomUtil.randomNumber();
        char c2 = RandomUtil.randomChar();
        char c3 = RandomUtil.randomChar("asdfjjkk");
        //List也支持
        WeightRandom weightRandom = RandomUtil.weightRandom(new WeightRandom.WeightObj[]{new WeightRandom.WeightObj("a", 1),
                new WeightRandom.WeightObj("b", 2),
                new WeightRandom.WeightObj("c", 3)});
        Object next = weightRandom.next();

        DateTime dateTime = RandomUtil.randomDay(5, 7);
        DateTime dateTime1 = RandomUtil.randomDate(DateUtil.date(), DateField.HOUR, 5, 10);
    }

    private static void randomStringTest() {
        String s = RandomUtil.randomString(5);
        String s1 = RandomUtil.randomStringUpper(5);
        String s2 = RandomUtil.randomStringWithoutStr(5,"abc");
        String s3 = RandomUtil.randomNumbers(5);
        String s4 = RandomUtil.randomString("jdsh",9);
    }

    private static void randomEleTest() {
        String s1 = RandomUtil.randomEle(new String[]{"a", "b", "c"});
        String s2 = RandomUtil.randomEle(new String[]{"a", "b", "c"}, 1);
        String s3 = RandomUtil.randomEle(new String[]{"a", "b", "c"}, 1);
        //List同理

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("a");
        objects.add("b");
        objects.add("c");
        List<Object> objects1 = RandomUtil.randomEles(objects, 2);
        List<Object> objects2 = RandomUtil.randomEleList(objects, 0);
        Set<Object> objects3 = RandomUtil.randomEleSet(objects, 2);
    }

    private static void randomInts() {
        boolean b = RandomUtil.randomBoolean();
        byte[] bytes = RandomUtil.randomBytes(5);
        int i = RandomUtil.randomInt();
        int i1 = RandomUtil.randomInt(5);
        int i2 = RandomUtil.randomInt(2, 5);
        int i3 = RandomUtil.randomInt(2, 5, false, true);
        int[] ints = RandomUtil.randomInts(5);
        // long ,float, double, BigDecimal类似
    }

    private static void getRandomTest() {
        ThreadLocalRandom random = RandomUtil.getRandom();
        Random random1 = RandomUtil.getRandom(false);
        SecureRandom secureRandom1 = RandomUtil.getSecureRandom();
        SecureRandom secureRandom4 = RandomUtil.getSecureRandomStrong();

        SecureRandom secureRandom = RandomUtil.createSecureRandom(new byte[]{1, 2, 3});
        SecureRandom secureRandom2 = RandomUtil.getSecureRandom(new byte[]{1, 2, 3});
        SecureRandom secureRandom3 = RandomUtil.getSHA1PRNGRandom(new byte[]{1, 2, 3});
    }
}
