package org.example.dotstart.mybatisflex.controller;

import com.mybatisflex.core.paginate.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.dotstart.mybatisflex.service.BlacklistService;
import org.example.dotstart.mybatisflex.entity.BlacklistEntity;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * 黑名单 控制层。
 *
 * @author wbb
 * @since 0.0.1
 */
@RestController
@RequestMapping("/blacklist")
@Tag(name = "黑名单控制层")
public class BlacklistController {

    @Autowired
    private BlacklistService blacklistService;

    /**
     * 添加 黑名单
     *
     * @param blacklist 黑名单
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("/save")
    @Operation(summary = "添加黑名单")
    public boolean save(@RequestBody BlacklistEntity blacklist) {
        return blacklistService.save(blacklist);
    }


    /**
     * 根据主键删除黑名单
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("/remove/{id}")
    @Operation(summary = "根据主键删除黑名单")
    @Parameters(value = {
    })
    public boolean remove(@PathVariable Serializable id) {
        return blacklistService.removeById(id);
    }


    /**
     * 根据主键更新黑名单
     *
     * @param blacklist 黑名单
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("/update")
    @Operation(summary = "根据主键更新黑名单")
    public boolean update(@RequestBody BlacklistEntity blacklist) {
        return blacklistService.updateById(blacklist);
    }


    /**
     * 查询所有黑名单
     *
     * @return 所有数据
     */
    @GetMapping("/list")
    @Operation(summary = "查询所有黑名单")
    public List<BlacklistEntity> list() {
        return blacklistService.list();
    }


    /**
     * 根据黑名单主键获取详细信息。
     *
     * @param id blacklist主键
     * @return 黑名单详情
     */
    @GetMapping("/getInfo/{id}")
    @Operation(summary = "根据黑名单主键获取详细信息")
    @Parameters(value = {
    })
    public BlacklistEntity getInfo(@PathVariable Serializable id) {
        return blacklistService.getById(id);
    }


    /**
     * 分页查询黑名单
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("/page")
    @Operation(summary = "分页查询黑名单")
    @Parameters(value = {
            @Parameter(name = "pageNumber", description = "页码", required = true),
            @Parameter(name = "pageSize", description = "每页大小", required = true)
    })
    public Page<BlacklistEntity> page(Page<BlacklistEntity> page) {
        return blacklistService.page(page);
    }
}