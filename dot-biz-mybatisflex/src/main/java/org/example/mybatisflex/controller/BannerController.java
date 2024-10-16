package org.example.mybatisflex.controller;

import com.mybatisflex.core.paginate.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.mybatisflex.entity.BannerEntity;
import org.example.mybatisflex.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * Banner管理 控制层。
 *
 * @author wbb
 * @since 0.0.1
 */
@RestController
@RequestMapping("/banner")
@Tag(name = "Banner管理控制层")
public class BannerController {

    @Autowired
    private BannerService bannerService;

    /**
     * 添加 Banner管理
     *
     * @param banner Banner管理
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("/save")
    @Operation(summary = "添加Banner管理")
    public boolean save(@RequestBody BannerEntity banner) {
        return bannerService.save(banner);
    }


    /**
     * 根据主键删除Banner管理
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("/remove/{id}")
    @Operation(summary = "根据主键删除Banner管理")
    @Parameters(value = {
            @Parameter(name = "id", description = "id", required = true)
    })
    public boolean remove(@PathVariable Serializable id) {
        return bannerService.removeById(id);
    }


    /**
     * 根据主键更新Banner管理
     *
     * @param banner Banner管理
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("/update")
    @Operation(summary = "根据主键更新Banner管理")
    public boolean update(@RequestBody BannerEntity banner) {
        return bannerService.updateById(banner);
    }


    /**
     * 查询所有Banner管理
     *
     * @return 所有数据
     */
    @GetMapping("/list")
    @Operation(summary = "查询所有Banner管理")
    public List<BannerEntity> list() {
        return bannerService.list();
    }


    /**
     * 根据Banner管理主键获取详细信息。
     *
     * @param id banner主键
     * @return Banner管理详情
     */
    @GetMapping("/getInfo/{id}")
    @Operation(summary = "根据Banner管理主键获取详细信息")
    @Parameters(value = {
            @Parameter(name = "id", description = "id", required = true)
    })
    public BannerEntity getInfo(@PathVariable Serializable id) {
        return bannerService.getById(id);
    }


    /**
     * 分页查询Banner管理
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("/page")
    @Operation(summary = "分页查询Banner管理")
    @Parameters(value = {
            @Parameter(name = "pageNumber", description = "页码", required = true),
            @Parameter(name = "pageSize", description = "每页大小", required = true)
    })
    public Page<BannerEntity> page(Page<BannerEntity> page) {
        return bannerService.page(page);
    }
}