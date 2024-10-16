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
 * 文章推荐 实体类。
 *
 * @author wbb
 * @since 0.0.1
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "文章推荐")
@Table(value = "b_article")
public class ArticleEntity {

    /**
     * 文章id
     */
    @Schema(description = "文章id")
    @Id(keyType = KeyType.Generator)
    private Long articleId;

    /**
     * 标题
     */
    @Schema(description = "标题")
    @Column(value = "title")
    private String title;

    /**
     * 文章类型
     */
    @Schema(description = "文章类型")
    @Column(value = "type")
    private String type;

    /**
     * 浏览量
     */
    @Schema(description = "浏览量")
    @Column(value = "pv")
    private Integer pv;

    /**
     * 文章状态（推广，不推广）
     */
    @Schema(description = "文章状态（推广，不推广）")
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

    /**
     * 附件id
     */
    @Schema(description = "附件id")
    @Column(value = "file_id")
    private Long fileId;


}
