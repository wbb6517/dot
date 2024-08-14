package org.example.dotstart.mybatisflex.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.experimental.Accessors;
import io.swagger.v3.oas.annotations.media.Schema;
import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Table;

import java.lang.Long;
import java.util.Date;
import java.lang.String;
import java.lang.Integer;

/**
 * 浏览信息表 实体类。
 *
 * @author wbb
 * @since 0.0.1
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "浏览信息表")
@Table(value = "b_browse")
public class BrowseEntity {

    /**
     * 用户id
     */
    @Schema(description = "用户id")
    @Column(value = "user_id")
    private Long userId;

    /**
     * 信息id
     */
    @Schema(description = "信息id")
    @Column(value = "info_id")
    private Long infoId;

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
