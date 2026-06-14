package com.mycloud.repository;

import com.mycloud.entity.FileEntity;

public interface FileRepository {
    public FileEntity getFileById(String fileId);
    public int saveFile(FileEntity file);
    public int updateFile(FileEntity file);
    public int deleteFile(String fileId);
}