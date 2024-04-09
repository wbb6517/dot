package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.ClassUtil;
import cn.hutool.core.util.StrUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.example.dotstart.lombok.BuilderExample;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;

public class ClassUtilTest {
    public static void main(String[] args) throws NoSuchMethodException {
        boolean primitiveWrapper1 = ClassUtil.isPrimitiveWrapper(Integer.class);
        boolean primitiveWrapper2 = ClassUtil.isPrimitiveWrapper(int.class);
        boolean primitiveWrapper3 = ClassUtil.isBasicType(Integer[].class);
        boolean primitiveWrapper4 = ClassUtil.isBasicType(int.class);
        boolean primitiveWrapper5 = ClassUtil.isSimpleTypeOrArray(Integer[].class);
        boolean primitiveWrapper6 = ClassUtil.isSimpleTypeOrArray(List.class);
        boolean primitiveWrapper7 = ClassUtil.isSimpleValueType(List.class);

        boolean assignable1 = ClassUtil.isAssignable(List.class, ArrayList.class);
        boolean assignable2 = ClassUtil.isAssignable(List.class, Set.class);

        boolean aPublic1 = ClassUtil.isPublic(List.class);
        boolean aPublic2 = ClassUtil.isNotPublic(List.class);
        boolean add1 = ClassUtil.isStatic(List.class.getMethod("add", Object.class));
        Method add3 = ClassUtil.setAccessible(List.class.getMethod("add", Object.class));
        boolean add2 = ClassUtil.isAbstract(List.class);
        boolean add4 = ClassUtil.isNormalClass(List.class);
        boolean add5 = ClassUtil.isEnum(List.class);
        Class<?> typeArgument = ClassUtil.getTypeArgument(List.class);
        String aPackage = ClassUtil.getPackage(List.class);
        String packagePath = ClassUtil.getPackagePath(List.class);
        Object defaultValue = ClassUtil.getDefaultValue(List.class);
        Object primitiveDefaultValue = ClassUtil.getPrimitiveDefaultValue(List.class);
        Object[] defaultValues = ClassUtil.getDefaultValues(List.class);
        boolean jdkClass = ClassUtil.isJdkClass(List.class);
        URL location = ClassUtil.getLocation(ClassUtil.class);
        String locationPath = ClassUtil.getLocationPath(ClassUtil.class);
        boolean abstractOrInterface = ClassUtil.isAbstractOrInterface(List.class);
        boolean anInterface = ClassUtil.isInterface(List.class);


    }

    private static void invokeTest() {
        Object invoke1 = ClassUtil.invoke("cn.hutool.core.util.StrUtil.isNotEmpty", new Object[]{"a"});
        Object invoke2 = ClassUtil.invoke("cn.hutool.core.util.StrUtil.isEmpty",true, new Object[]{"a"});
        Object invoke3 = ClassUtil.invoke("cn.hutool.core.util.StrUtil","isNotEmpty", new Object[]{"a"});
        Object invoke4 = ClassUtil.invoke("cn.hutool.core.util.StrUtil","isEmpty",true, new Object[]{"a"});
    }

    private static void getDeclaredFieldTest() {
        Field classes = ClassUtil.getDeclaredField(String.class, "value");
        Field[] declaredFields = ClassUtil.getDeclaredFields(String.class);

        Set<String> classPathResources1 = ClassUtil.getClassPathResources();
        Set<String> classPathResources2 = ClassUtil.getClassPathResources(true);
        Set<String> classPathResources3 = ClassUtil.getClassPathResources(false);

        Set<String> classPathResources4 = ClassUtil.getClassPaths("/F:/SourceCodeMirror/dot/dot-start/target/classes/");

        String classPathResources5 = ClassUtil.getClassPath();
        String classPathResources6 = ClassUtil.getClassPath(true);
        String classPathResources7 = ClassUtil.getClassPath(false);

        URL classPathURL1 = ClassUtil.getClassPathURL();
        URL classPathURL2= ClassUtil.getResourceURL("org/example/dotstart/hutool/core/util/ClassUtilTest.class");
        List<URL> resources1 = ClassUtil.getResources("org/example/dotstart/hutool/core/util/");
        URL resources2 = ClassUtil.getResourceUrl("org/example/dotstart/hutool/core/util/", ClassUtilTest.class);


        String[] javaClassPaths = ClassUtil.getJavaClassPaths();
        ClassLoader contextClassLoader = ClassUtil.getContextClassLoader();

//        ClassUtil.isAllAssignableFrom(HashMap.class, Map.class);
    }

    private static void scanPackageByAnnotationTest() {
        Set<Class<?>> classes1 = ClassUtil.scanPackageByAnnotation("../../lombok", AllArgsConstructor.class);
        Set<Class<?>> classes2 = ClassUtil.scanPackageBySuper("../../lombok", Object.class);
        Set<Class<?>> classes3 = ClassUtil.scanPackage("../../lombok");


        Set<String> publicMethodNames1 = ClassUtil.getPublicMethodNames(ClassUtil.class);
        Set<String> publicMethodNames2 = ClassUtil.getDeclaredMethodNames(ClassUtil.class);
        Method[] publicMethodNames3 = ClassUtil.getDeclaredMethods(ClassUtil.class);

        Method[] publicMethods = ClassUtil.getPublicMethods(ClassUtil.class);
        List<Method> publicMethods1 = ClassUtil.getPublicMethods(ClassUtil.class, Method::isDefault);
        List<Method> publicMethods2 = ClassUtil.getPublicMethods(ClassUtil.class, "getPublicMethods");

        Method getPublicMethodNames = ClassUtil.getPublicMethod(ClassUtil.class, "getPublicMethodNames", Class.class);

        Method getPublicMethodNames1 = ClassUtil.getDeclaredMethodOfObj(ClassUtil.class, "getPublicMethodNames", Class.class);
        Method getPublicMethodNames2 = ClassUtil.getDeclaredMethod(ClassUtil.class, "getPublicMethodNames", Class.class);
    }

    private static void getClassTest() {
        Class<String> test = ClassUtil.getClass("test");
        Class<?> enclosingClass = ClassUtil.getEnclosingClass(test);
        boolean topLevelClass = ClassUtil.isTopLevelClass(test);

        String className1 = ClassUtil.getClassName(test, true);
        String className2 = ClassUtil.getClassName(test, false);
        String className3 = ClassUtil.getClassName(String[].class, true);
        String className4 = ClassUtil.getClassName(String[].class, false);

        String shortClassName = ClassUtil.getShortClassName(className2);

        Class<?>[] classes = ClassUtil.getClasses(test, 1);

        boolean equals = ClassUtil.equals(String.class, "java.lang.String", true);
    }
}
