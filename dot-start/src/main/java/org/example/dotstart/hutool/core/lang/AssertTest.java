package org.example.dotstart.hutool.core.lang;

import cn.hutool.core.lang.Assert;

public class AssertTest {
    public static void main(String[] args) {
        Assert.state(false);
        Assert.checkIndex(3, 4);
        Assert.checkBetween(2, 2, 4);
        Assert.notEquals(1, 2);
        Assert.equals(1, 2);

    }

    private static void isInstanceOfTest() {
        Assert.isInstanceOf(String.class, "abc");
        Assert.isAssignable(CharSequence.class, String.class);
    }

    private static void notContainTest() {
        Assert.notContain("abc", "a");
        Assert.notContain("abc", "a", "参数{}不能包含{}", "name", "a");

        Assert.noNullElements(new String[]{"a", "b"});
        Assert.noNullElements(new String[]{"a", "b"}, "参数{}不能包含null", "name");
    }

    private static void notEmptyTest() {
        Assert.notEmpty("");
        Assert.notEmpty("", "参数{}不能为空", "name");
        // 可为数组，，集合，，map

        Assert.notBlank("\n ");
        Assert.notBlank("\n ", "参数{}不能为空", "name");
        // 可为数组，，集合，，map
    }

    private static void isNullTest() {
        Assert.isNull("ddd");
        Assert.isNull("ddd", "{}不为空", "ddd");
        // notNull同理
    }

    private static void isTrueTest() {
        Assert.isTrue(1 != 1);
        Assert.isTrue(1 != 1, "1不等{}于1", "aaaa");
        // isFalse同理
    }
}
