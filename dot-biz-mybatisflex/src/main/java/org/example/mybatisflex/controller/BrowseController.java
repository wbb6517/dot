package org.example.mybatisflex.controller;

import com.mybatisflex.core.paginate.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.mybatisflex.entity.BrowseEntity;
import org.example.mybatisflex.service.BrowseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * 浏览信息表 控制层。
 *
 * @author wbb
 * @since 0.0.1
 */
@RestController
@RequestMapping("/browse")
@Tag(name = "浏览信息表控制层")
public class BrowseController {

    @Autowired
    private BrowseService browseService;

    /**
     * 添加 浏览信息表
     *
     * @param browse 浏览信息表
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("/save")
    @Operation(summary = "添加浏览信息表")
    public boolean save(@RequestBody BrowseEntity browse) {
        return browseService.save(browse);
    }


    /**
     * 根据主键删除浏览信息表
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("/remove/{id}")
    @Operation(summary = "根据主键删除浏览信息表")
    @Parameters(value = {
    })
    public boolean remove(@PathVariable Serializable id) {
        return browseService.removeById(id);
    }


    /**
     * 根据主键更新浏览信息表
     *
     * @param browse 浏览信息表
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("/update")
    @Operation(summary = "根据主键更新浏览信息表")
    public boolean update(@RequestBody BrowseEntity browse) {
        return browseService.updateById(browse);
    }


    /**
     * 查询所有浏览信息表
     *
     * @return 所有数据
     */
    @GetMapping("/list")
    @Operation(summary = "查询所有浏览信息表")
    public List<BrowseEntity> list() {
        return browseService.list();
    }


    /**
     * 根据浏览信息表主键获取详细信息。
     *
     * @param id browse主键
     * @return 浏览信息表详情
     */
    @GetMapping("/getInfo/{id}")
    @Operation(summary = "根据浏览信息表主键获取详细信息")
    @Parameters(value = {
    })
    public BrowseEntity getInfo(@PathVariable Serializable id) {
        return browseService.getById(id);
    }


    /**
     * 分页查询浏览信息表
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("/page")
    @Operation(summary = "分页查询浏览信息表")
    @Parameters(value = {
            @Parameter(name = "pageNumber", description = "页码", required = true),
            @Parameter(name = "pageSize", description = "每页大小", required = true)
    })
    public Page<BrowseEntity> page(Page<BrowseEntity> page) {
        return browseService.page(page);
    }
}