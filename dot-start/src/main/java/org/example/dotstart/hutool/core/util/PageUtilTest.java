package org.example.dotstart.hutool.core.util;

import cn.hutool.core.lang.Segment;
import cn.hutool.core.util.PageUtil;

public class PageUtilTest {
    public static void main(String[] args) {
        int firstPageNo = PageUtil.getFirstPageNo();
        PageUtil.setFirstPageNo(1);
        PageUtil.setOneAsFirstPageNo();
        int start = PageUtil.getStart(2, 10);
        int start1 = PageUtil.getStart(2, 10);
        int[] ints = PageUtil.transToStartEnd(2, 10);
        Segment<Integer> segment = PageUtil.toSegment(2, 10);
        int i = PageUtil.totalPage(2, 10);
        int[] rainbow = PageUtil.rainbow(2, 10);
        int[] rainbow1 = PageUtil.rainbow(2, 10, 20);


    }
}
