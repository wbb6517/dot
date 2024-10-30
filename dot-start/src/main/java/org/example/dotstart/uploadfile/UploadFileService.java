package org.example.dotstart.uploadfile;

import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

public interface UploadFileService extends IService<UploadFileInfoEntity> {

    UploadFileResponse upLoadFile(String appId, String bucketName, String dir, String fileName, String busMsg, MultipartFile file);

    void downloadFile(String bucketName, String fileKey, String appId, HttpServletResponse response);

    UploadFileResponse getFileInfo(String fileKey);
}
