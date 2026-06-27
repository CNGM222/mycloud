package com.gm222.server.model.entity;

import com.gm222.server.model.enums.files.Type;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class files {
    private final long id;
    private final long user_id;
    private final long parent_id;
    private final String name;
    private final Type type;
    private final String mime_type;
    private final long size;
    private final long content_id;
    private final String md5;
    private final String extension;
    private final LocalDateTime created_at;
    private final LocalDateTime updated_at;

    public files(long id,
                 long userId,
                 long parentId,
                 String name,
                 Type type,
                 String mimeType,
                 long size,
                 long contentId,
                 String md5,
                 String extension,
                 LocalDateTime createdAt,
                 LocalDateTime updatedAt) {
        this.id = id;
        user_id = userId;
        parent_id = parentId;
        this.name = name;
        this.type = type;
        mime_type = mimeType;
        this.size = size;
        content_id = contentId;
        this.md5 = md5;
        this.extension = extension;
        created_at = createdAt;
        updated_at = updatedAt;
    }
}
