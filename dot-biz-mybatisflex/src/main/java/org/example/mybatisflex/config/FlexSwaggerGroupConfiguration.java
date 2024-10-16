package org.example.mybatisflex.config;


import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration(proxyBeanMethods = false)
public class FlexSwaggerGroupConfiguration {

    /**
     * 当前模块的 API 分组
     */
    @Bean
    public GroupedOpenApi systemGroupedOpenApi() {
        return GroupedOpenApi.builder()
                .group("mybatis-flex")
                .pathsToMatch("/**")
                .packagesToScan("org.example.mybatisflex.controller")
                .build();
    }

}
