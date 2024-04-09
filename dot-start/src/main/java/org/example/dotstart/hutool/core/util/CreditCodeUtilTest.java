package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.CreditCodeUtil;

public class CreditCodeUtilTest {
    public static void main(String[] args) {
        String s = CreditCodeUtil.randomCreditCode();
        boolean creditCode = CreditCodeUtil.isCreditCode(s);
        boolean creditCode1 = CreditCodeUtil.isCreditCode("jadsffjlasdfijuiasdg");
        boolean creditCodeSimple = CreditCodeUtil.isCreditCodeSimple(s);
        boolean creditCodeSimple1 = CreditCodeUtil.isCreditCodeSimple("dskjgladsjkgasjdglk");
    }
}
