package org.example.leetcode.config;


import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration(proxyBeanMethods = false)
public class LeetcodeSwaggerGroupConfiguration {

    /**
     * 当前模块的 API 分组
     */
    @Bean
    public GroupedOpenApi leetcodeGroupedOpenApi() {
        return GroupedOpenApi.builder()
                .group("leetcode")
                .pathsToMatch("/**")
                .packagesToScan("org.example.leetcode.controller")
                .build();
    }

}
