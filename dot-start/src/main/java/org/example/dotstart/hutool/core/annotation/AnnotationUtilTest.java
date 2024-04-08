package org.example.dotstart.hutool.core.annotation;

import cn.hutool.core.annotation.AnnotationUtil;
import cn.hutool.core.annotation.CombinationAnnotationElement;
import cn.hutool.core.annotation.SynthesizedAggregateAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.example.dotstart.DotStartApplication;
import org.example.dotstart.lombok.DataExample;
import org.example.dotstart.lombok.EqualsAndHashCodeExample;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AliasFor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import java.util.Map;

@Slf4j
public class AnnotationUtilTest {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException {

    }

    private static void aggregatingFromAnnotationTest() {
        SynthesizedAggregateAnnotation synthesizedAggregateAnnotation1 = AnnotationUtil.aggregatingFromAnnotation(DotStartApplication.class.getAnnotations());
        SynthesizedAggregateAnnotation synthesizedAggregateAnnotation2 = AnnotationUtil.aggregatingFromAnnotationWithMeta(DotStartApplication.class.getAnnotations());
    }

    private static void getSynthesizedAnnotationsTest() {
        SpringBootApplication synthesizedAnnotation1 = AnnotationUtil.getSynthesizedAnnotation(EnableAsync.class,SpringBootApplication.class );
        SpringBootApplication synthesizedAnnotation2 = AnnotationUtil.getSynthesizedAnnotation(SpringBootApplication.class);

        SpringBootApplication synthesizedAnnotation3 = AnnotationUtil.getSynthesizedAnnotation(EnableAsync.class,SpringBootApplication.class );
    }

    private static void getAnnotationAliasTest() {
        Object annotationAlias = AnnotationUtil.getAnnotationAlias(SpringBootApplication.class, SpringBootConfiguration.class);
    }

    private static void isSynthesizedAnnotationTest() {
//        boolean synthesizedAnnotation = AnnotationUtil.isSynthesizedAnnotation();
    }

    private static void scanClassAndMethodTest() throws NoSuchMethodException {
        List<Annotation> annotations1 = AnnotationUtil.scanClass(SpringBootApplication.class);

        List<Annotation> annotations2 = AnnotationUtil.scanMethod(SpringBootApplication.class.getMethod("exclude"));
    }

    private static void scanMetaAnnotationTest() {
        List<Annotation> annotations = AnnotationUtil.scanMetaAnnotation(SpringBootApplication.class);
    }

    private static void isInheritedTest() {
        boolean inherited = AnnotationUtil.isInherited(SpringBootApplication.class);
    }

    private static void isDocumentedTest() {
        boolean documented = AnnotationUtil.isDocumented(SpringBootApplication.class);
    }

    private static void getTargetTypeTest() {
        ElementType[] targetType = AnnotationUtil.getTargetType(SpringBootApplication.class);
    }

    private static void getRetentionPolicyTest() {
        RetentionPolicy retentionPolicy = AnnotationUtil.getRetentionPolicy(SpringBootApplication.class);
    }

    private static void getAnnotationValueMapTest() {
        Map<String, Object> annotationValueMap = AnnotationUtil.getAnnotationValueMap(SpringBootApplication.class, ComponentScan.class);
    }

    private static void getAnnotationValueTest() {
        Object annotationValue1 = AnnotationUtil.getAnnotationValue(SpringBootApplication.class, ComponentScan.class);
        Object annotationValue2 = AnnotationUtil.getAnnotationValue(SpringBootApplication.class, Data.class);

        Object annotationValue3 = AnnotationUtil.getAnnotationValue(SpringBootApplication.class, ComponentScan.class,"basePackages");

//        public static <A extends Annotation, R> R getAnnotationValue(AnnotatedElement annotationEle, Func1<A, R> propertyName)
//        Object annotationValue4 = AnnotationUtil.getAnnotationValue(SpringBootApplication.class, ComponentScan.class,()->{});
    }

    private static void hasAnnotationTest() {
        boolean b1 = AnnotationUtil.hasAnnotation(SpringBootApplication.class, Data.class);
        boolean b2 = AnnotationUtil.hasAnnotation(SpringBootApplication.class, SpringBootConfiguration.class);
    }

    private static void getAnnotationTest() {
        Data annotations1 = AnnotationUtil.getAnnotation(SpringBootApplication.class, Data.class);
        SpringBootConfiguration annotations2 = AnnotationUtil.getAnnotation(SpringBootApplication.class, SpringBootConfiguration.class);
    }

    private static void getCombinationAnnotationsTest() {
        SpringBootConfiguration[] combinationAnnotations1 = AnnotationUtil.getCombinationAnnotations(SpringBootApplication.class, SpringBootConfiguration.class);
        Inherited[] combinationAnnotations2 = AnnotationUtil.getCombinationAnnotations(SpringBootApplication.class, Inherited.class);
    }

    private static void getAnnotationsTest() {
        Annotation[] annotations1 = AnnotationUtil.getAnnotations(SpringBootApplication.class, true);
        Annotation[] annotations2 = AnnotationUtil.getAnnotations(SpringBootApplication.class, false);

        SpringBootConfiguration[] annotations4 = AnnotationUtil.getAnnotations(SpringBootApplication.class, true, SpringBootConfiguration.class);

        Annotation[] annotations5 = AnnotationUtil.getAnnotations(SpringBootApplication.class, true, (e)->e instanceof SpringBootConfiguration);
    }

    private static void toCombinationTest() {
        CombinationAnnotationElement combination1 = AnnotationUtil.toCombination(SpringBootApplication.class);
        CombinationAnnotationElement combination2 = AnnotationUtil.toCombination(Data.class);
    }

    private static void isJdkMetaAnnotationTest() {
        boolean b1 = AnnotationUtil.isJdkMetaAnnotation(Slf4j.class);
        boolean b2 = AnnotationUtil.isJdkMetaAnnotation(Target.class);

        log.info("b1: {}", b1);
        log.info("b2: {}", b2);
    }

}
