package org.example.dotstart.mybatisflex.controller;

import com.mybatisflex.core.paginate.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.dotstart.mybatisflex.entity.AccountEntity;
import org.example.dotstart.mybatisflex.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * 访问 控制层。
 *
 * @author wbb
 * @since 0.0.1
 */
@RestController
@RequestMapping("/account")
@Tag(name = "访问控制层")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 添加 访问
     *
     * @param account 访问
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("/save")
    @Operation(summary = "添加访问")
    public boolean save(@RequestBody AccountEntity account) {
        return accountService.save(account);
    }


    /**
     * 根据主键删除访问
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("/remove/{id}")
    @Operation(summary = "根据主键删除访问")
    @Parameters(value = {
            @Parameter(name = "id", description = "id", required = true)
    })
    public boolean remove(@PathVariable Serializable id) {
        return accountService.removeById(id);
    }


    /**
     * 根据主键更新访问
     *
     * @param account 访问
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("/update")
    @Operation(summary = "根据主键更新访问")
    public boolean update(@RequestBody AccountEntity account) {
        return accountService.updateById(account);
    }


    /**
     * 查询所有访问
     *
     * @return 所有数据
     */
    @GetMapping("/list")
    @Operation(summary = "查询所有访问")
    public List<AccountEntity> list() {
        return accountService.list();
    }


    /**
     * 根据访问主键获取详细信息。
     *
     * @param id account主键
     * @return 访问详情
     */
    @GetMapping("/getInfo/{id}")
    @Operation(summary = "根据访问主键获取详细信息")
    @Parameters(value = {
            @Parameter(name = "id", description = "id", required = true)
    })
    public AccountEntity getInfo(@PathVariable("id") Serializable id) {
        return accountService.getById(id);
    }


    /**
     * 分页查询访问
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("/page")
    @Operation(summary = "分页查询访问")
    @Parameters(value = {
            @Parameter(name = "pageNumber", description = "页码", required = true),
            @Parameter(name = "pageSize", description = "每页大小", required = true)
    })
    public Page<AccountEntity> page(Page<AccountEntity> page) {
        return accountService.page(page);
    }
}