package org.example.dotstart.uploadfile;


import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.f4b6a3.ulid.UlidCreator;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.regex.Matcher;


/**
 * 原始数据(primitiveData)维护服务的缺省实现
 *
 * @author Taiji Generator
 */
@Service
public class UploadFileServiceImpl extends ServiceImpl<UploadFileInfoMapper, UploadFileInfoEntity> implements UploadFileService {

    @Value("${file.save-path}")
    private String savePath;
    @Value("${file.save-type}")
    private String saveType;
    @Value("${file.ip-address}")
    private String ipAddress;



    @Resource
    private UploadFileInfoMapper uploadFileInfoMapper;




    /**
     * 单文件上传
     *
     * @param appId
     * @param bucketName
     * @param dir
     * @param fileName
     * @param busMsg
     * @param file
     * @return
     */
    @Override
    public UploadFileResponse upLoadFile(String appId, String bucketName, String dir, String fileName, String busMsg, MultipartFile file) {

        if (StrUtil.isEmpty(fileName)) {
            fileName = file.getOriginalFilename();
        }
        String suffixName = fileName.contains(".") ? fileName.substring(fileName.lastIndexOf(".")) : null;
        // 新文件名：UUID+后缀名
        String fileKey = UlidCreator.getUlid().toString();
        String newName =  fileKey + suffixName;
        String filePath = "";
        if (StrUtil.isEmpty(dir)) {
            filePath = savePath + File.separator + bucketName+File.separator;
        }else {
            // 去除首尾的斜杠反斜杠
            // 所有的斜杠和反斜杠替换成File.separator
            dir = dir.replaceAll("^[\\\\/]+", "").replaceAll("[\\\\/]+$", "")
                    .replaceAll("[\\\\/]", Matcher.quoteReplacement(File.separator));
            filePath = savePath + File.separator + bucketName+File.separator+dir+File.separator;
        }
        if (!FileUtil.exist(filePath)) {
            FileUtil.mkdir(filePath);
        }

        File newFile = new File(filePath, newName);
        try {
            //文件写入
            file.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


        UploadFileResponse uploadFileResponse = new UploadFileResponse();
        uploadFileResponse.setAppId(appId);
        uploadFileResponse.setBucketName(bucketName);
        uploadFileResponse.setFileKey(fileKey);
        uploadFileResponse.setFileType(suffixName);
        uploadFileResponse.setFileName(fileName);
        uploadFileResponse.setUrl(ipAddress + File.separator + filePath + File.separator + newName);
        uploadFileResponse.setSize(file.getSize());
        uploadFileResponse.setBusMap(busMsg);
        // todo 信息入库
        UploadFileInfoEntity uploadFileInfoEntity = new UploadFileInfoEntity();
        uploadFileInfoEntity.setId(fileKey);
        uploadFileInfoEntity.setAppId(appId);
        uploadFileInfoEntity.setBucketName(bucketName);
        uploadFileInfoEntity.setFileType(suffixName);
        uploadFileInfoEntity.setFileName(fileName);
        uploadFileInfoEntity.setFilePath(filePath + newName);
        uploadFileInfoEntity.setUrl(ipAddress + File.separator + filePath  + newName);
        uploadFileInfoEntity.setSize(String.valueOf(file.getSize()));
        uploadFileInfoEntity.setBumMap(busMsg);
        uploadFileInfoEntity.setCreatedAt(LocalDateTime.now());
        uploadFileInfoEntity.setUpdatedAt(LocalDateTime.now());
        uploadFileInfoEntity.setDelFlag(0);
        uploadFileInfoEntity.setCreator(null);
        uploadFileInfoEntity.setUpdater(null);
        uploadFileInfoMapper.insert(uploadFileInfoEntity);
        return uploadFileResponse;
    }

    /**
     * 单文件下载
     *
     * @param bucketName
     * @param fileKey
     * @param appId
     * @return
     */
    @Override
    public void downloadFile(String bucketName, String fileKey, String appId, HttpServletResponse response) {
        UploadFileInfoEntity uploadFileInfoEntity = uploadFileInfoMapper.selectById(fileKey);


        String filePath = uploadFileInfoEntity.getFilePath();
        String fileName = uploadFileInfoEntity.getFileName();
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fileName, StandardCharsets.UTF_8));

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            OutputStream out = response.getOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = fileInputStream.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
            fileInputStream.close();
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 获取文件信息
     *
     * @param fileKey
     * @return
     */
    @Override
    public UploadFileResponse getFileInfo(String fileKey) {
        UploadFileInfoEntity uploadFileInfoEntity = uploadFileInfoMapper.selectById(fileKey);
        UploadFileResponse uploadFileResponse =UploadFileCover.INSTANCE.uploadFileEntityToResponse(uploadFileInfoEntity);
        return uploadFileResponse;
    }


}
