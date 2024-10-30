package org.example.dotstart.uploadfile;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UploadFileCover {

    public static UploadFileCover INSTANCE= Mappers.getMapper(UploadFileCover.class);

    @Mapping(source = "id", target = "fileKey")
    UploadFileResponse uploadFileEntityToResponse(UploadFileInfoEntity uploadFileInfoEntity);
}
