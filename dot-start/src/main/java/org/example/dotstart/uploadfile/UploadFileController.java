package org.example.dotstart.uploadfile;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@Tag(name = "文件拓展维护服务", description = "文件拓展维护服务")
@ApiSupport(order = 1)
@Validated
@RestController
@RequestMapping({"/file"})
public class UploadFileController {

    @Autowired
    private UploadFileService uploadFileService;

    @Operation(summary = "单文件上传接口", description = "单文件上传接口")
    @ApiOperationSupport(order = 2)
    @Parameters({
            @Parameter(name = "appId", description = "应用id", required = true),
            @Parameter(name = "bucketName", description = "文件桶的名称,同一系统非必要情况，尽量使用一个桶", required = true),
            @Parameter(name = "dir", description = "文件前缀，用于文件桶内目录若不填则直接存桶内,"),
            @Parameter(name = "fileName", description = "文件名称,若不填写默认为文件名称"),
            @Parameter(name = "busMsg", description = "json字符串,为业务系统信息，不允许有中文"),
            @Parameter(name = "file", description = "文件", required = true)
    })
    @PostMapping(value = "/singleFileUpload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<UploadFileResponse> uploadFiles(
            @RequestPart(name = "appId") String appId,
            @RequestPart(name = "bucketName") String bucketName,
            @RequestPart(name = "dir", required = false) String dir,
            @RequestPart(name = "fileName", required = false) String fileName,
            @RequestPart(name = "busMsg", required = false) String busMsg,
            @RequestPart(name = "file") MultipartFile file) {
        return ResponseEntity.ok(uploadFileService.upLoadFile(appId, bucketName, dir, fileName, busMsg, file));
    }

    @Operation(summary = "获取文件文件流", description = "获取文件流")
    @ApiOperationSupport(order = 3)
    @Parameters({
            @Parameter(name = "bucketName", description = "文件桶的名称,同一系统非必要情况，尽量使用一个桶", required = true),
            @Parameter(name = "fileKey", description = "文件key", required = true),
            @Parameter(name = "appId", description = "应用id", required = true)
    })
    @GetMapping(value = "/getFileStream")
    public void downloadFiles(
            @RequestParam(name = "bucketName") String bucketName,
            @RequestParam(name = "fileKey") String fileKey,
            @RequestParam(name = "appId") String appId,
            HttpServletResponse response) {
        uploadFileService.downloadFile(bucketName, fileKey,appId,response);
    }

    @Operation(summary = "通过fileKey获取文件信息", description = "通过fileKey获取文件信息")
    @ApiOperationSupport(order = 4)
    @Parameter(name = "fileKey", description = "文件key", required = true)
    @GetMapping(value = "/getFileInfo")
    public ResponseEntity<UploadFileResponse> getFileInfo(@RequestParam(name = "fileKey") String fileKey) {
        return ResponseEntity.ok(uploadFileService.getFileInfo(fileKey));
    }
}
