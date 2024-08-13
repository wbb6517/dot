package org.example.dotstart.mybatisflex.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.mybatisflex.core.paginate.Page;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.dotstart.mybatisflex.entity.AccountEntity;
import org.example.dotstart.mybatisflex.service.AccountService;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import java.io.Serializable;
import java.util.List;

/**
 *  控制层。
 *
 * @author wbb
 * @since 2024-07-24
 */
@RestController
@Tag(name = "接口")
@RequestMapping("/accountEntity")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 添加。
     *
     * @param accountEntity 
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @ApiOperationSupport(order = 1)
    @PostMapping("save")
    @Operation(summary="保存")
    public boolean save(@RequestBody @Parameter(description="")AccountEntity accountEntity) {
        return accountService.save(accountEntity);
    }

    /**
     * 根据主键删除。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    @Operation(summary="根据主键")
    public boolean remove(@PathVariable @Parameter(description="主键")Serializable id) {
        return accountService.removeById(id);
    }

    /**
     * 根据主键更新。
     *
     * @param accountEntity 
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    @Operation(summary="根据主键更新")
    public boolean update(@RequestBody @Parameter(description="主键")AccountEntity accountEntity) {
        return accountService.updateById(accountEntity);
    }

    /**
     * 查询所有。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    @Operation(summary="查询所有")
    public List<AccountEntity> list() {
        return accountService.list();
    }

    /**
     * 根据主键获取详细信息。
     *
     * @param id 主键
     * @return 详情
     */
    @GetMapping("getInfo/{id}")
    @Operation(summary="根据主键获取")
    public AccountEntity getInfo(@PathVariable Serializable id) {
        return accountService.getById(id);
    }

    /**
     * 分页查询。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    @Operation(description="分页查询")
    public Page<AccountEntity> page(@Parameter(description="分页信息")Page<AccountEntity> page) {
        return accountService.page(page);
    }

}
