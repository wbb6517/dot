package org.example.dotstart.uploadfile;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 上传文件信息记录表 实体类。
 *
 * @author wbb
 * @since 2024-10-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "上传文件信息记录表")
@TableName("upload_file_info")
public class UploadFileInfoEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 文件key
     */
    @Schema(description = "文件key")
    private String id;

    /**
     * 应用ID
     */
    @Schema(description = "应用ID")
    private String appId;

    /**
     * 存储桶名称
     */
    @Schema(description = "存储桶名称")
    private String bucketName;

    /**
     * 文件类型
     */
    @Schema(description = "文件类型")
    private String fileType;

    /**
     * 原始文件名
     */
    @Schema(description = "原始文件名")
    private String fileName;

    /**
     * 文件存储路径
     */
    @Schema(description = "文件存储路径")
    private String filePath;

    /**
     * 文件访问链接
     */
    @Schema(description = "文件访问链接")
    private String url;

    /**
     * 文件大小
     */
    @Schema(description = "文件大小")
    private String size;

    /**
     * 用户业务信息
     */
    @Schema(description = "用户业务信息")
    private String bumMap;

    /**
     * 创建人
     */
    @Schema(description = "创建人")
    private String creator;

    /**
     * 创建时间
     */
    @Schema(description = "创建时间")
    private LocalDateTime createdAt;

    /**
     * 修改人
     */
    @Schema(description = "修改人")
    private String updater;

    /**
     * 修改时间
     */
    @Schema(description = "修改时间")
    private LocalDateTime updatedAt;

    /**
     * 有效状态
     */
    @Schema(description = "有效状态")
    private Integer delFlag;


}
