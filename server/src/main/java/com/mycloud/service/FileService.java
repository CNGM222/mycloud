package com.mycloud.service;

import com.mycloud.entity.FileEntity;
import com.mycloud.entity.result;

public class FileService {
    //保存文件
    public result SaveFile(FileEntity fileData, long userId) {
        return new result(0, "File saved successfully");
    }
    //获取文件流
    public result getFileStream(String fileId, long userId) {
        return new result(0, "File stream retrieved successfully");
    }
    //创建预览
    public result createPreview(String fileId, long userId) {
        return new result(0, "Preview created successfully");
    }
    //管理文件
    public result manageFile(String command, long userId) {
        return new result(0, "File managed successfully");
    }
}
