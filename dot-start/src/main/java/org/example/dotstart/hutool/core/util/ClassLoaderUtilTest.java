package org.example.dotstart.hutool.core.util;

import cn.hutool.core.lang.JarClassLoader;
import cn.hutool.core.util.ClassLoaderUtil;

import java.io.File;

public class ClassLoaderUtilTest {
    public static void main(String[] args) {
        ClassLoader contextClassLoader1 = ClassLoaderUtil.getContextClassLoader();
        ClassLoader contextClassLoader2 = ClassLoaderUtil.getSystemClassLoader();

        ClassLoader contextClassLoader3 = ClassLoaderUtil.getClassLoader();

        Class<?> aClass = ClassLoaderUtil.loadClass("java.lang.String");
        Class<?> aClass1 = ClassLoaderUtil.loadClass("java.lang.String", false);
        Class<?> aClass2 = ClassLoaderUtil.loadPrimitiveClass("int");

        JarClassLoader jarClassLoader = ClassLoaderUtil.getJarClassLoader(new File("D:\\test\\test.jar"));
//        Class<?> aClass3 = ClassLoaderUtil.loadClass(new File("D:\\test\\test.jar"), "cn.hutool.core.util.CharsetUtilTest");
        boolean present = ClassLoaderUtil.isPresent("java.lang.String");
        boolean present1 = ClassLoaderUtil.isPresent("java.lang.String", contextClassLoader1);


    }
}
