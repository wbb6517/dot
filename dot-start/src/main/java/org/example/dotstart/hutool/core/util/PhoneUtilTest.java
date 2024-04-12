package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.PhoneUtil;

public class PhoneUtilTest {
    public static void main(String[] args) {
        boolean mobile = PhoneUtil.isMobile("12345678901");
        boolean mobileHk = PhoneUtil.isMobileHk("123456789");
        boolean mobileTw = PhoneUtil.isMobileTw("123456789");
        boolean mobileMo = PhoneUtil.isMobileMo("123456789");
        boolean tel = PhoneUtil.isTel("123456789");
        boolean tel400800 = PhoneUtil.isTel400800("123456789");
        boolean phone = PhoneUtil.isPhone("123456789");
        CharSequence charSequence = PhoneUtil.hideBefore("12345678901");
        CharSequence charSequence1 = PhoneUtil.hideBetween("13275168888");
        CharSequence charSequence2 = PhoneUtil.hideAfter("13275168888");
        CharSequence charSequence3 = PhoneUtil.subBefore("13275168888");
        CharSequence charSequence4 = PhoneUtil.subBetween("13275168888");
        CharSequence charSequence5 = PhoneUtil.subAfter("13275168888");
        CharSequence charSequence6 = PhoneUtil.subTelBefore("13275168888");
        CharSequence charSequence7 = PhoneUtil.subTelAfter("13275168888");
    }
}
