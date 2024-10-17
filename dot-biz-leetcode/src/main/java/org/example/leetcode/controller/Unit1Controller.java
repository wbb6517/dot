package org.example.leetcode.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.example.leetcode.service.Unit1Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 访问 控制层。
 *
 * @author wbb
 * @since 0.0.1
 */
@RestController
@RequestMapping("/unit1")
@Tag(name = "LeetCode Unit1")
public class Unit1Controller {

@Resource
private Unit1Service unit1Service;


    @GetMapping("/1")
    @Operation(summary = "88.合并两个有序数组")

    public boolean getDemo1() {
        unit1Service.getDemo1();
        return true;
    }


}