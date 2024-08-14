package org.example.dotstart.mybatisflex.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.experimental.Accessors;
import io.swagger.v3.oas.annotations.media.Schema;
import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;

import java.lang.Long;
import java.util.Date;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Integer;

/**
 * 合作表 实体类。
 *
 * @author wbb
 * @since 0.0.1
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "合作表")
@Table(value = "b_cooperate")
public class CooperateEntity {

    /**
     * 合作id
     */
    @Schema(description = "合作id")
    @Id(keyType = KeyType.Generator)
    private Long cooperateId;

    /**
     * 项目id
     */
    @Schema(description = "项目id")
    @Column(value = "project_id")
    private Long projectId;

    /**
     * 项目名称
     */
    @Schema(description = "项目名称")
    @Column(value = "project_name")
    private String projectName;

    /**
     * 成员id
     */
    @Schema(description = "成员id")
    @Column(value = "user_id")
    private Long userId;

    /**
     * 是否被邀请（0：未邀请 1：已邀请）
     */
    @Schema(description = "是否被邀请（0：未邀请 1：已邀请）")
    @Column(value = "status")
    private String status;

    /**
     * 承诺类型
     */
    @Schema(description = "承诺类型")
    @Column(value = "type")
    private String type;

    /**
     * 承诺登记
     */
    @Schema(description = "承诺登记")
    @Column(value = "cooperate_content")
    private String cooperateContent;

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
    private Boolean deleted;

    /**
     * 项目角色
     */
    @Schema(description = "项目角色")
    @Column(value = "project_rule")
    private String projectRule;

    /**
     * 是否同意邀请（0：未同意 1：已同意）
     */
    @Schema(description = "是否同意邀请（0：未同意 1：已同意）")
    @Column(value = "member_status")
    private String memberStatus;

    /**
     * 是否同意结项（0：未同意 1：已同意)
     */
    @Schema(description = "是否同意结项（0：未同意 1：已同意)")
    @Column(value = "stop_item")
    private Boolean stopItem;

    /**
     * 是否申请加入（0：未申请 1：已申请）
     */
    @Schema(description = "是否申请加入（0：未申请 1：已申请）")
    @Column(value = "join_status")
    private Boolean joinStatus;

    /**
     * 状态（0：邀请、1：申请）
     */
    @Schema(description = "状态（0：邀请、1：申请）")
    @Column(value = "apply_status")
    private Boolean applyStatus;

    /**
     * 拒绝/取消申请（0，1）
     */
    @Schema(description = "拒绝/取消申请（0，1）")
    @Column(value = "refuse_status")
    private Integer refuseStatus;

    /**
     * 是否同意中止（0：否 1：是）
     */
    @Schema(description = "是否同意中止（0：否 1：是）")
    @Column(value = "stop_continue")
    private Boolean stopContinue;


}
