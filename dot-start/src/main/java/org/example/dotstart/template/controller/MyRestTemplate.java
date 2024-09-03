package org.example.dotstart.template.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("template")
@Tag(name = "MyRestTemplate")
public class MyRestTemplate {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private RestClient restClient;

    @Operation(summary = "getRestTemplate请求")
    @GetMapping("/getRestTemplate")
    public ResponseEntity<Object> getRestTemplate() {

        ClassLoader classLoader = RestTemplate.class.getClassLoader();
        boolean present = ClassUtils.isPresent("jakarta.xml.bind.Binder", classLoader);
        log.info("present:{}", present);
        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
        log.info("messageConverters:{}", messageConverters);
        return ResponseEntity.ok("ok");
    }

    @Operation(summary = "getRestClient请求")
    @GetMapping("/getRestClient")
    public ResponseEntity<Object> getRestTemplate1() {

        ResponseEntity<String> entity = restClient.get()
                .uri("http://localhost:8080/template/getRestTemplate")
                .retrieve()
                .toEntity(String.class);

        return ResponseEntity.ok(entity);
    }
}
