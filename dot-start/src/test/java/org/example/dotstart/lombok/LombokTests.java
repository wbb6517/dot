package org.example.dotstart.lombok;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class LombokTests {
    @Test
    void ValExampleTest() {
        ValExample valExample = new ValExample();
        String example = valExample.example();
        log.info("example: {}", example);
        valExample.example2();
    }

    @Test
    void NonNullExampleTest() {
//        NonNullExample nonNullExample = new NonNullExample(null);
        NonNullExample nonNullExample = new NonNullExample("null");
        log.info("name: {}", nonNullExample);
    }

    @Test
    void CleanupExampleTest() {
        CleanupExample cleanupExample = new CleanupExample();
        try {
            cleanupExample.example();
        } catch (Exception e) {
            log.error("error: {}", e.getMessage());
        }
    }

    @Test
    void BuilderExampleTest() {
        BuilderExample builderExample = BuilderExample.builder()
                .name("wbb")
                .age(18)
                .occupation("student")
                .occupation("developer")
                .build();
        log.info("builderExample: {}", builderExample);
    }

    @Test
    void WithExampleTest() {
        WithExample withExample = new WithExample("wbb", 18);
        WithExample withExample1 = withExample.withAge(19);
        log.info("withExample1: {}", withExample1);
    }
}
