package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.ArrayUtil;
import com.sun.source.tree.ReturnTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayUtilTest {
    public static void main(String[] args) {


    }

    private static void mapTest() {
        Integer[] map = ArrayUtil.map(new String[]{"1", "2", "3"}, Integer.class, Integer::valueOf);
        List<Integer> map1 = ArrayUtil.map(new String[]{"1", "2", "3"}, Integer::valueOf);
        Set<Integer> integers = ArrayUtil.mapToSet(new String[]{"1", "2", "3"}, Integer::valueOf);

        boolean equals = ArrayUtil.equals(new String[]{"1", "2", "3"}, new String[]{"1", "2", "3"});
        boolean sub = ArrayUtil.isSub(new String[]{"1", "2", "3"}, new String[]{"1", "2"});
        int i1 = ArrayUtil.indexOfSub(new String[]{"1", "2", "3"}, new String[]{"1", "2"});
        int i2 = ArrayUtil.lastIndexOfSub(new String[]{"1", "2", "1"}, new String[]{"1"});
        int i3 = ArrayUtil.lastIndexOfSub(new String[]{"1", "2", "1"},1, new String[]{"1"});
        boolean sorted = ArrayUtil.isSorted(new String[]{"1", "2", "3"});
        boolean sorted1 = ArrayUtil.isSortedASC(new String[]{"1", "2", "3"});
        boolean sorted2 = ArrayUtil.isSortedDESC(new String[]{"1", "2", "3"});
    }

    private static void minTest() {
        int min = ArrayUtil.min(new int[]{1, 2, 3});
        int max = ArrayUtil.max(new int[]{1, 2, 3});
        int[] shuffle = ArrayUtil.shuffle(new int[]{1, 2, 3});
        int[] swap = ArrayUtil.swap(new int[]{1, 2, 3}, 1, 2);

        int i = ArrayUtil.emptyCount(new String[]{"1", "2", "3", null});
        boolean b = ArrayUtil.hasEmpty(new String[]{"1", "2", ""});
        boolean allEmpty = ArrayUtil.isAllEmpty(new String[]{"1", "2", ""});
        boolean allNotEmpty = ArrayUtil.isAllNotEmpty(new String[]{"1", "2", ""});
        boolean allNotNull = ArrayUtil.isAllNotNull(new String[]{"1", "2", ""}, new String[]{"1", "2", ""});

        String[] distinct = ArrayUtil.distinct(new String[]{"1", "2", "3", "1"});
        String[] distinct1 = ArrayUtil.distinct(new String[]{"1", "2", "3", "1"}, (a) -> a + "1", false);
        String[] distinct2 = ArrayUtil.distinct(new String[]{"1", "2", "3", "1"}, (a) -> a + "1", true);
    }

    private static void removeTest() {
        String[] remove1 = ArrayUtil.remove(new String[]{"1", "2", "3"}, 1);
        String[] remove2 = ArrayUtil.removeEle(new String[]{"1", "2", "3"}, "2");
        String[] reverse1 = ArrayUtil.reverse(new String[]{"1", "2", "3", "4", "5"});
        String[] reverse2 = ArrayUtil.reverse(new String[]{"1", "2", "3", "4", "5"}, 1, 4);
    }

    private static void wrapTest() {
        Object[] wrap = ArrayUtil.wrap(new String[]{"1", "2", "3"});
        boolean array1 = ArrayUtil.isArray(new String[]{"1", "2", "3"});
        Object o = ArrayUtil.get(new String[]{"1", "2", "3"}, 1);
        Object[] any = ArrayUtil.getAny(new String[]{"1", "2", "3"}, 1, 3);
        String[] sub = ArrayUtil.sub(new String[]{"1", "2", "3"}, 1, 3);
        Object[] sub1 = ArrayUtil.sub(new String[]{"1", "2", "3"}, 1, 3, 1);
        String string = ArrayUtil.toString(new String[]{"1", "2", "3"});
        int length = ArrayUtil.length(new String[]{"1", "2", "3"});
        String join = ArrayUtil.join(new String[]{"1", "2", "3"}, ",");
        String join1 = ArrayUtil.join(new String[]{"1", "2", "3"}, ",", "<", ">");
        String join2 = ArrayUtil.join(new String[]{"1", "2", "3"}, ",", (e) -> e + "1");


        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("1");
        stringArrayList.add("2");
        stringArrayList.add("3");
        String[] array = ArrayUtil.toArray(stringArrayList, String.class);
    }

    private static void indexOfAndContainsTest() {
        int i = ArrayUtil.indexOf(new String[]{"1", "2", "3"}, "2");
        int i1 = ArrayUtil.indexOf(new String[]{"1", "2", "3"}, "2", 2);
        int i2 = ArrayUtil.indexOfIgnoreCase(new String[]{"1", "2", "3"}, "2");
        int i3 = ArrayUtil.lastIndexOf(new String[]{"1", "2", "2"}, "2");
        int i4 = ArrayUtil.lastIndexOf(new String[]{"1", "2", "2"}, "2", 1);

        boolean contains = ArrayUtil.contains(new String[]{"1", "2", "3"}, "2");
        boolean b = ArrayUtil.containsIgnoreCase(new String[]{"1", "2", "3"}, "2");
        boolean b1 = ArrayUtil.containsAny(new String[]{"1", "2", "3"}, "4", "5");
        boolean b2 = ArrayUtil.containsAll(new String[]{"1", "2", "3"}, "1", "4");
    }

    private static void zipTest() {
        Map<String, String> zip1 = ArrayUtil.zip(new String[]{"1", "3", "2"}, new String[]{"4", "5", "6"}, true);
        Map<String, String> zip2 = ArrayUtil.zip(new String[]{"1", "3", "2"}, new String[]{"4", "5", "6"}, false);
    }

    private static void editTest() {
        String[] edit1 = ArrayUtil.edit(new String[]{"1", "2", "3"}, (e) -> e + "1");
        String[] edit2 = ArrayUtil.filter(new String[]{"11", "2", "3"}, (e) -> e.length() > 1);
        String[] edit3 = ArrayUtil.removeNull(new String[]{"11", "2", "3", null});
        String[] edit4 = ArrayUtil.removeEmpty(new String[]{"", "  ", "3", null});
        String[] edit5 = ArrayUtil.removeBlank(new String[]{"", "  ", "3", null});
        String[] edit6 = ArrayUtil.nullToEmpty(new String[]{"", "  ", "3", null});
    }

    private static void resizeTest() {
        String[] strings1 = ArrayUtil.resize(new String[]{"1", "2", "3"}, 5, String.class);
        String[] strings2 = ArrayUtil.resize(new String[]{"1", "2", "3"}, 2);
        String[] strings3 = ArrayUtil.addAll(new String[]{"1", "2", "3"}, new String[]{"4", "5", "6"});
        Object copy1 = ArrayUtil.copy(new String[]{"1", "2", "3"}, new String[]{"4", "5", "6"}, 2);
        Object copy2 = ArrayUtil.copy(new String[]{"1", "2", "3"}, 1, new String[]{"4", "5", "6", null}, 2, 2);
        String[] clone = ArrayUtil.clone(new String[]{"1", "2", "3"});
    }

    private static void castTest() {
        Object[] cast = ArrayUtil.cast(Integer.class, new Integer[]{1, 2, 3});
        Integer[] append = ArrayUtil.append(new Integer[]{1, 2, 3}, 4);

        String[] strings1 = ArrayUtil.setOrAppend(new String[]{"1", "2", "3"}, 1, "4");
        String[] strings2 = ArrayUtil.setOrAppend(new String[]{"1", "2", "3"}, 5, "4");
        String[] strings3 = ArrayUtil.replace(new String[]{"1", "2", "3"}, -1, "4");
        String[] strings4 = ArrayUtil.replace(new String[]{"1", "2", "3"}, 5, "4");
        String[] strings5 = ArrayUtil.insert(new String[]{"1", "2", "3"}, 0, "4");
        String[] strings6 = ArrayUtil.insert(new String[]{"1", "2", "3"}, 5, "4");
    }

    private static void newArrayTest() {
        Object[] objects1 = ArrayUtil.newArray(String.class, 3);
        Object[] objects2 = ArrayUtil.newArray(3);

        Class<?> componentType1 = ArrayUtil.getComponentType(objects1);
        Class<?> componentType2 = ArrayUtil.getComponentType(objects2);
        Class<?> componentType3 = ArrayUtil.getComponentType(String[].class);

        Class<?> arrayType = ArrayUtil.getArrayType("222".getClass());
    }

    private static void isNotEmptyTest() {
        boolean b1 = ArrayUtil.isNotEmpty(new String[]{"1", "2", "3"});
        boolean b2 = ArrayUtil.hasNull(new String[]{"1", "2", "3", null});
        boolean b3 = ArrayUtil.isAllNull(new String[]{"1", "2", "3", null});

        String s1 = ArrayUtil.firstNonNull(new String[]{null, "1", "2", "3", null});
        String s2 = ArrayUtil.firstMatch("2"::equals, new String[]{null, "1", "2", "3", null});

        int i1 = ArrayUtil.matchIndex((e) -> 2 == e.length(), new String[]{"12", "2", "3", "45"});
        int i2 = ArrayUtil.matchIndex((e) -> 2 == e.length(), 2, new String[]{"12", "2", "3", "45"});
    }

    private static void isEmptyTest() {
        boolean b1 = ArrayUtil.isEmpty(new String[0]);
        boolean b2 = ArrayUtil.isEmpty(new Object());
        Object[] objects = ArrayUtil.defaultIfEmpty(new Object[0], new Object[1]);
    }
}
