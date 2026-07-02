package com.gm222.server.model.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class file_contents {
    private final long id;
    private final long file_id;
    private final long size;
    private final String md5;
    private final LocalDateTime created_at;
    private final LocalDateTime updated_at;

    public file_contents(long id, long fileId, long size, String md5, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.id = id;
        this.file_id = fileId;
        this.size = size;
        this.md5 = md5;
        this.created_at = createdAt;
        this.updated_at = updatedAt;
    }
}

