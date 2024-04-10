package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.ModifierUtil;

public class ModifierUtilTest {
    public static void main(String[] args) throws NoSuchMethodException {
        boolean b = ModifierUtil.hasModifier(ModifierUtil.class, ModifierUtil.ModifierType.PRIVATE);
        boolean b1 = ModifierUtil.isPublic(ModifierUtil.class);
        boolean b3 = ModifierUtil.isStatic(ModifierUtil.class);
        boolean b4 = ModifierUtil.isSynthetic(ModifierUtil.class);
//        boolean b5 = ModifierUtil.isAbstract(ModifierUtil.class);
//        boolean b6 = ModifierUtil.removeFinalModify(ModifierUtil.class);

    }
}
