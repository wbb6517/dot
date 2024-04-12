package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.ReUtil;
import cn.hutool.core.util.ReflectUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;

public class ReflectUtilTest {
    public static void main(String[] args) throws NoSuchFieldException {
        Set<String> publicMethodNames = ReflectUtil.getPublicMethodNames(ReflectUtil.class);
        Method[] publicMethods = ReflectUtil.getPublicMethods(ReflectUtil.class);
        Method getPublicMethods = ReflectUtil.getMethodByName(ReflectUtil.class, "getPublicMethods");


    }

    private static void getConstructorTest() {
        Constructor<ReflectUtil> constructor = ReflectUtil.getConstructor(ReflectUtil.class);
        Constructor<ReflectUtil>[] constructors = ReflectUtil.getConstructors(ReflectUtil.class);
        Constructor<?>[] constructorsDirectly = ReflectUtil.getConstructorsDirectly(ReflectUtil.class);

        boolean b = ReflectUtil.hasField(ReflectUtil.class, "CONSTRUCTORS_CACHE");
        Field constructorsCache = ReflectUtil.getField(ReflectUtil.class, "CONSTRUCTORS_CACHE");
        String fieldName = ReflectUtil.getFieldName(constructorsCache);
        Map<String, Field> fieldMap = ReflectUtil.getFieldMap(ReflectUtil.class);
        Field[] fields = ReflectUtil.getFields(ReflectUtil.class);
        Field[] fields1 = ReflectUtil.getFieldsDirectly(ReflectUtil.class,true);
        Object constructorsCache1 = ReflectUtil.getFieldValue(ReflectUtil.class, "CONSTRUCTORS_CACHE");

        Object[] fieldsValue = ReflectUtil.getFieldsValue(ReflectUtil.class);


        ReflectUtil.setFieldValue(ReflectUtil.class, "CONSTRUCTORS_CACHE", null);
    }


}
