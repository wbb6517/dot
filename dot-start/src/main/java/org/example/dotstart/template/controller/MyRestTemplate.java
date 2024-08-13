package org.example.dotstart.template.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("template")
@Tag(name = "MyRestTemplate")
public class MyRestTemplate {


    @Operation(summary = "get请求")
    @Parameter(name = "id", description = "文件id")
    @GetMapping("/getRestTemplate")
    public ResponseEntity<Object> getRestTemplate() {
//        restTemplate.
        return ResponseEntity.ok("ok");
    }
}
