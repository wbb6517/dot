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
 * 投诉信息表 实体类。
 *
 * @author wbb
 * @since 0.0.1
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "投诉信息表")
@Table(value = "b_complaint")
public class ComplaintEntity {

    /**
     * 意见反馈id
     */
    @Schema(description = "意见反馈id")
    @Id(keyType = KeyType.Generator)
    private Long complaintId;

    /**
     * 用户id
     */
    @Schema(description = "用户id")
    @Column(value = "user_id")
    private Long userId;

    /**
     * 意见反馈人
     */
    @Schema(description = "意见反馈人")
    @Column(value = "user_name")
    private String userName;

    /**
     * 类型
     */
    @Schema(description = "类型")
    @Column(value = "type")
    private String type;

    /**
     * 联系电话
     */
    @Schema(description = "联系电话")
    @Column(value = "tel_num")
    private String telNum;

    /**
     * 被投诉人/机构id
     */
    @Schema(description = "被投诉人/机构id")
    @Column(value = "target_user_id")
    private Long targetUserId;

    /**
     * 被投诉人/机构名称
     */
    @Schema(description = "被投诉人/机构名称")
    @Column(value = "target_name")
    private String targetName;

    /**
     * 意见反馈描述
     */
    @Schema(description = "意见反馈描述")
    @Column(value = "reason")
    private String reason;

    /**
     * 图片/视频id
     */
    @Schema(description = "图片/视频id")
    @Column(value = "file_id")
    private Long fileId;

    /**
     * 处理结果
     */
    @Schema(description = "处理结果")
    @Column(value = "handle_result")
    private String handleResult;

    /**
     * 处理内容
     */
    @Schema(description = "处理内容")
    @Column(value = "handle_content")
    private String handleContent;

    /**
     * 处理人id
     */
    @Schema(description = "处理人id")
    @Column(value = "handler")
    private Long handler;

    /**
     * 联系电话
     */
    @Schema(description = "联系电话")
    @Column(value = "handler_tel")
    private String handlerTel;

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
     * 逻辑删除
     */
    @Schema(description = "逻辑删除")
    @Column(value = "deleted")
    private Integer deleted;

    /**
     * 意见反馈编号
     */
    @Schema(description = "意见反馈编号")
    @Column(value = "complaint_code")
    private String complaintCode;


}
