package org.example.dotstart.mybatisflex.controller;

import com.mybatisflex.core.paginate.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.dotstart.mybatisflex.entity.CooperateEntity;
import org.example.dotstart.mybatisflex.service.CooperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * 合作表 控制层。
 *
 * @author wbb
 * @since 0.0.1
 */
@RestController
@RequestMapping("/cooperate")
@Tag(name = "合作表控制层")
public class CooperateController {

    @Autowired
    private CooperateService cooperateService;

    /**
     * 添加 合作表
     *
     * @param cooperate 合作表
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("/save")
    @Operation(summary = "添加合作表")
    public boolean save(@RequestBody CooperateEntity cooperate) {
        return cooperateService.save(cooperate);
    }


    /**
     * 根据主键删除合作表
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("/remove/{id}")
    @Operation(summary = "根据主键删除合作表")
    @Parameters(value = {
            @Parameter(name = "cooperateId", description = "合作id", required = true)
    })
    public boolean remove(@PathVariable Serializable id) {
        return cooperateService.removeById(id);
    }


    /**
     * 根据主键更新合作表
     *
     * @param cooperate 合作表
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("/update")
    @Operation(summary = "根据主键更新合作表")
    public boolean update(@RequestBody CooperateEntity cooperate) {
        return cooperateService.updateById(cooperate);
    }


    /**
     * 查询所有合作表
     *
     * @return 所有数据
     */
    @GetMapping("/list")
    @Operation(summary = "查询所有合作表")
    public List<CooperateEntity> list() {
        return cooperateService.list();
    }


    /**
     * 根据合作表主键获取详细信息。
     *
     * @param id cooperate主键
     * @return 合作表详情
     */
    @GetMapping("/getInfo/{id}")
    @Operation(summary = "根据合作表主键获取详细信息")
    @Parameters(value = {
            @Parameter(name = "cooperateId", description = "合作id", required = true)
    })
    public CooperateEntity getInfo(@PathVariable Serializable id) {
        return cooperateService.getById(id);
    }


    /**
     * 分页查询合作表
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("/page")
    @Operation(summary = "分页查询合作表")
    @Parameters(value = {
            @Parameter(name = "pageNumber", description = "页码", required = true),
            @Parameter(name = "pageSize", description = "每页大小", required = true)
    })
    public Page<CooperateEntity> page(Page<CooperateEntity> page) {
        return cooperateService.page(page);
    }
}