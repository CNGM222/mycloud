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
}

