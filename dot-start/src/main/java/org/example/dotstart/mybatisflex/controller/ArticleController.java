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
import org.example.dotstart.mybatisflex.service.ArticleService;
import org.example.dotstart.mybatisflex.entity.ArticleEntity;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * 文章推荐 控制层。
 *
 * @author wbb
 * @since 0.0.1
 */
@RestController
@RequestMapping("/article")
@Tag(name = "文章推荐控制层")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 添加 文章推荐
     *
     * @param article 文章推荐
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("/save")
    @Operation(summary = "添加文章推荐")
    public boolean save(@RequestBody ArticleEntity article) {
        return articleService.save(article);
    }


    /**
     * 根据主键删除文章推荐
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("/remove/{id}")
    @Operation(summary = "根据主键删除文章推荐")
    @Parameters(value = {
            @Parameter(name = "articleId", description = "文章id", required = true)
    })
    public boolean remove(@PathVariable Serializable id) {
        return articleService.removeById(id);
    }


    /**
     * 根据主键更新文章推荐
     *
     * @param article 文章推荐
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("/update")
    @Operation(summary = "根据主键更新文章推荐")
    public boolean update(@RequestBody ArticleEntity article) {
        return articleService.updateById(article);
    }


    /**
     * 查询所有文章推荐
     *
     * @return 所有数据
     */
    @GetMapping("/list")
    @Operation(summary = "查询所有文章推荐")
    public List<ArticleEntity> list() {
        return articleService.list();
    }


    /**
     * 根据文章推荐主键获取详细信息。
     *
     * @param id article主键
     * @return 文章推荐详情
     */
    @GetMapping("/getInfo/{id}")
    @Operation(summary = "根据文章推荐主键获取详细信息")
    @Parameters(value = {
            @Parameter(name = "articleId", description = "文章id", required = true)
    })
    public ArticleEntity getInfo(@PathVariable Serializable id) {
        return articleService.getById(id);
    }


    /**
     * 分页查询文章推荐
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("/page")
    @Operation(summary = "分页查询文章推荐")
    @Parameters(value = {
            @Parameter(name = "pageNumber", description = "页码", required = true),
            @Parameter(name = "pageSize", description = "每页大小", required = true)
    })
    public Page<ArticleEntity> page(Page<ArticleEntity> page) {
        return articleService.page(page);
    }
}