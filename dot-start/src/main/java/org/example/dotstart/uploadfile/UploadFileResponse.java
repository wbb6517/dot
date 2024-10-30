package org.example.dotstart.uploadfile;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class UploadFileResponse {
    //{
    //	"appId": "",
    //	"bucketName": "",
    //	"fileKey": "",
    //	"fileType": "",
    //	"fileName": "",
    //	"url": "",
    //	"size": 0,
    //	"busMap": ""
    //}
    @Schema(description = "应用ID")
    private String appId;
    @Schema(description = "存储桶名称")
    private String bucketName;
    @Schema(description = "文件key")
    private String fileKey;
    @Schema(description = "文件类型")
    private String fileType;
    @Schema(description = "原始文件名")
    private String fileName;
    @Schema(description = "文件访问地址")
    private String url;
    @Schema(description = "文件大小")
    private Long size;
    @Schema(description = "用户业务信息")
    private String busMap;
}
