package org.example.mybatisflex.controller;

import com.mybatisflex.core.paginate.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.mybatisflex.entity.CooperateStatusEntity;
import org.example.mybatisflex.service.CooperateStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * 合作状态表 控制层。
 *
 * @author wbb
 * @since 0.0.1
 */
@RestController
@RequestMapping("/cooperateStatus")
@Tag(name = "合作状态表控制层")
public class CooperateStatusController {

    @Autowired
    private CooperateStatusService cooperateStatusService;

    /**
     * 添加 合作状态表
     *
     * @param cooperateStatus 合作状态表
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("/save")
    @Operation(summary = "添加合作状态表")
    public boolean save(@RequestBody CooperateStatusEntity cooperateStatus) {
        return cooperateStatusService.save(cooperateStatus);
    }


    /**
     * 根据主键删除合作状态表
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("/remove/{id}")
    @Operation(summary = "根据主键删除合作状态表")
    @Parameters(value = {
            @Parameter(name = "projectId", description = "项目id", required = true),
            @Parameter(name = "userId", description = "成员id", required = true)
    })
    public boolean remove(@PathVariable Serializable id) {
        return cooperateStatusService.removeById(id);
    }


    /**
     * 根据主键更新合作状态表
     *
     * @param cooperateStatus 合作状态表
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("/update")
    @Operation(summary = "根据主键更新合作状态表")
    public boolean update(@RequestBody CooperateStatusEntity cooperateStatus) {
        return cooperateStatusService.updateById(cooperateStatus);
    }


    /**
     * 查询所有合作状态表
     *
     * @return 所有数据
     */
    @GetMapping("/list")
    @Operation(summary = "查询所有合作状态表")
    public List<CooperateStatusEntity> list() {
        return cooperateStatusService.list();
    }


    /**
     * 根据合作状态表主键获取详细信息。
     *
     * @param id cooperateStatus主键
     * @return 合作状态表详情
     */
    @GetMapping("/getInfo/{id}")
    @Operation(summary = "根据合作状态表主键获取详细信息")
    @Parameters(value = {
            @Parameter(name = "projectId", description = "项目id", required = true),
            @Parameter(name = "userId", description = "成员id", required = true)
    })
    public CooperateStatusEntity getInfo(@PathVariable Serializable id) {
        return cooperateStatusService.getById(id);
    }


    /**
     * 分页查询合作状态表
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("/page")
    @Operation(summary = "分页查询合作状态表")
    @Parameters(value = {
            @Parameter(name = "pageNumber", description = "页码", required = true),
            @Parameter(name = "pageSize", description = "每页大小", required = true)
    })
    public Page<CooperateStatusEntity> page(Page<CooperateStatusEntity> page) {
        return cooperateStatusService.page(page);
    }
}