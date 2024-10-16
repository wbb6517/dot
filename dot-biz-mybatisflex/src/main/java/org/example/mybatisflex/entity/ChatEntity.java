package org.example.mybatisflex.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 聊天记录表 实体类。
 *
 * @author wbb
 * @since 0.0.1
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "聊天记录表")
@Table(value = "b_chat")
public class ChatEntity {

    /**
     * 单条聊天id
     */
    @Schema(description = "单条聊天id")
    @Id(keyType = KeyType.Generator)
    private Long chatId;

    /**
     * 发信人id
     */
    @Schema(description = "发信人id")
    @Column(value = "user_id")
    private Long userId;

    /**
     * 收信人id
     */
    @Schema(description = "收信人id")
    @Column(value = "target_id")
    private Long targetId;

    /**
     * 内容
     */
    @Schema(description = "内容")
    @Column(value = "content")
    private String content;

    /**
     * 状态（未读/已读）
     */
    @Schema(description = "状态（未读/已读）")
    @Column(value = "type")
    private String type;

    /**
     * 创建时间
     */
    @Schema(description = "创建时间")
    @Column(value = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Schema(description = "创建人")
    @Column(value = "creator")
    private String creator;

    /**
     * 更新人
     */
    @Schema(description = "更新人")
    @Column(value = "updater")
    private String updater;

    /**
     * 更新时间
     */
    @Schema(description = "更新时间")
    @Column(value = "update_time")
    private Date updateTime;

    /**
     * 收信人角色
     */
    @Schema(description = "收信人角色")
    @Column(value = "target_type")
    private String targetType;

    /**
     * 发信人名称
     */
    @Schema(description = "发信人名称")
    @Column(value = "user_name")
    private String userName;

    /**
     * 收信人名称
     */
    @Schema(description = "收信人名称")
    @Column(value = "send_user_name")
    private String sendUserName;

    /**
     * 消息类型（文本、图片）
     */
    @Schema(description = "消息类型（文本、图片）")
    @Column(value = "status")
    private String status;

    /**
     * 删除
     */
    @Schema(description = "删除")
    @Column(value = "deleted")
    private Boolean deleted;

    /**
     * 标题
     */
    @Schema(description = "标题")
    @Column(value = "title")
    private String title;

    /**
     * 封面图片
     */
    @Schema(description = "封面图片")
    @Column(value = "img")
    private String img;

    /**
     * 类型ID
     */
    @Schema(description = "类型ID")
    @Column(value = "collection_id")
    private Long collectionId;

    /**
     * 链接地址
     */
    @Schema(description = "链接地址")
    @Column(value = "route_name")
    private String routeName;


}
