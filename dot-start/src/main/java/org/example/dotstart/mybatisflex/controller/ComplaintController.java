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
import org.example.dotstart.mybatisflex.service.ComplaintService;
import org.example.dotstart.mybatisflex.entity.ComplaintEntity;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * 投诉信息表 控制层。
 *
 * @author wbb
 * @since 0.0.1
 */
@RestController
@RequestMapping("/complaint")
@Tag(name = "投诉信息表控制层")
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    /**
     * 添加 投诉信息表
     *
     * @param complaint 投诉信息表
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("/save")
    @Operation(summary = "添加投诉信息表")
    public boolean save(@RequestBody ComplaintEntity complaint) {
        return complaintService.save(complaint);
    }


    /**
     * 根据主键删除投诉信息表
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("/remove/{id}")
    @Operation(summary = "根据主键删除投诉信息表")
    @Parameters(value = {
            @Parameter(name = "complaintId", description = "意见反馈id", required = true)
    })
    public boolean remove(@PathVariable Serializable id) {
        return complaintService.removeById(id);
    }


    /**
     * 根据主键更新投诉信息表
     *
     * @param complaint 投诉信息表
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("/update")
    @Operation(summary = "根据主键更新投诉信息表")
    public boolean update(@RequestBody ComplaintEntity complaint) {
        return complaintService.updateById(complaint);
    }


    /**
     * 查询所有投诉信息表
     *
     * @return 所有数据
     */
    @GetMapping("/list")
    @Operation(summary = "查询所有投诉信息表")
    public List<ComplaintEntity> list() {
        return complaintService.list();
    }


    /**
     * 根据投诉信息表主键获取详细信息。
     *
     * @param id complaint主键
     * @return 投诉信息表详情
     */
    @GetMapping("/getInfo/{id}")
    @Operation(summary = "根据投诉信息表主键获取详细信息")
    @Parameters(value = {
            @Parameter(name = "complaintId", description = "意见反馈id", required = true)
    })
    public ComplaintEntity getInfo(@PathVariable Serializable id) {
        return complaintService.getById(id);
    }


    /**
     * 分页查询投诉信息表
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("/page")
    @Operation(summary = "分页查询投诉信息表")
    @Parameters(value = {
            @Parameter(name = "pageNumber", description = "页码", required = true),
            @Parameter(name = "pageSize", description = "每页大小", required = true)
    })
    public Page<ComplaintEntity> page(Page<ComplaintEntity> page) {
        return complaintService.page(page);
    }
}