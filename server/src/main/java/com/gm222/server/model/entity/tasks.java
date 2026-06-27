package com.gm222.server.model.entity;

import com.gm222.server.model.enums.tasks.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class tasks {
    private final long id;
    private final long user_id;
    private final long file_id;
    private final Task_type task_type;
    private final Client_type client_type;
    private final Status status;
    private final int progress;
    private final String error_message;
    private final LocalDateTime created_at;
    private final LocalDateTime updated_at;

    public tasks(long id,
                 long userId,
                 long fileId,
                 Task_type taskType,
                 Client_type clientType,
                 Status status, int progress,
                 String errorMessage,
                 LocalDateTime createdAt,
                 LocalDateTime updatedAt){
        this.id = id;
        this.user_id = userId;
        this.file_id = fileId;
        this.task_type = taskType;
        this.client_type = clientType;
        this.status = status;
        this.progress = progress;
        this.error_message = errorMessage;
        this.created_at = createdAt;
        this.updated_at = updatedAt;
    }
}
