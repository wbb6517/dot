package org.example.dotstart.aop.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("aop")
@Tag(name = "AOP测试")
public class AOPController {

    @Operation(summary = "普通body请求")
    @PostMapping("/saveBody")
    public ResponseEntity<Object> saveBody(@RequestParam("id") String id) {
        System.out.println(id);
        return ResponseEntity.ok(id);
    }

    @Operation(summary = "get请求")
    @Parameter(name = "id", description = "文件id")
    @GetMapping("/getBody")
    public ResponseEntity<Object> getBody(@RequestParam("id") String id) {
        System.out.println(id);
        int i = 1 / 0;
        return ResponseEntity.ok(id);
    }
}

