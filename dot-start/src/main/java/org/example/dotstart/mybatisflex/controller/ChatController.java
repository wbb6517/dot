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
import org.example.dotstart.mybatisflex.service.ChatService;
import org.example.dotstart.mybatisflex.entity.ChatEntity;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * 聊天记录表 控制层。
 *
 * @author wbb
 * @since 0.0.1
 */
@RestController
@RequestMapping("/chat")
@Tag(name = "聊天记录表控制层")
public class ChatController {

    @Autowired
    private ChatService chatService;

    /**
     * 添加 聊天记录表
     *
     * @param chat 聊天记录表
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("/save")
    @Operation(summary = "添加聊天记录表")
    public boolean save(@RequestBody ChatEntity chat) {
        return chatService.save(chat);
    }


    /**
     * 根据主键删除聊天记录表
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("/remove/{id}")
    @Operation(summary = "根据主键删除聊天记录表")
    @Parameters(value = {
            @Parameter(name = "chatId", description = "单条聊天id", required = true)
    })
    public boolean remove(@PathVariable Serializable id) {
        return chatService.removeById(id);
    }


    /**
     * 根据主键更新聊天记录表
     *
     * @param chat 聊天记录表
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("/update")
    @Operation(summary = "根据主键更新聊天记录表")
    public boolean update(@RequestBody ChatEntity chat) {
        return chatService.updateById(chat);
    }


    /**
     * 查询所有聊天记录表
     *
     * @return 所有数据
     */
    @GetMapping("/list")
    @Operation(summary = "查询所有聊天记录表")
    public List<ChatEntity> list() {
        return chatService.list();
    }


    /**
     * 根据聊天记录表主键获取详细信息。
     *
     * @param id chat主键
     * @return 聊天记录表详情
     */
    @GetMapping("/getInfo/{id}")
    @Operation(summary = "根据聊天记录表主键获取详细信息")
    @Parameters(value = {
            @Parameter(name = "chatId", description = "单条聊天id", required = true)
    })
    public ChatEntity getInfo(@PathVariable Serializable id) {
        return chatService.getById(id);
    }


    /**
     * 分页查询聊天记录表
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("/page")
    @Operation(summary = "分页查询聊天记录表")
    @Parameters(value = {
            @Parameter(name = "pageNumber", description = "页码", required = true),
            @Parameter(name = "pageSize", description = "每页大小", required = true)
    })
    public Page<ChatEntity> page(Page<ChatEntity> page) {
        return chatService.page(page);
    }
}