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
 * 合作状态表 实体类。
 *
 * @author wbb
 * @since 0.0.1
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "合作状态表")
@Table(value = "b_cooperate_status")
public class CooperateStatusEntity {

    /**
     * 项目id
     */
    @Schema(description = "项目id")
    @Id(keyType = KeyType.Generator)
    private Long projectId;

    /**
     * 成员id
     */
    @Schema(description = "成员id")
    @Id(keyType = KeyType.Generator)
    private Long userId;

    /**
     * 状态（移除，参与）
     */
    @Schema(description = "状态（移除，参与）")
    @Column(value = "status")
    private String status;

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


}
