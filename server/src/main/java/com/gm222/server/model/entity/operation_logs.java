package com.gm222.server.model.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class operation_logs {
    private final Integer id;
    private final Integer user_id;
    private final String action;
    private final Integer target_id;
    private final String target_type;
    private final String client_type;
    private final String ip_address;
    private final LocalDateTime created_at;

    public operation_logs(Integer id, Integer userId, String action, Integer targetId, String targetType, String clientType, String ipAddress, LocalDateTime createdAt) {
        this.id = id;
        user_id = userId;
        this.action = action;
        target_id = targetId;
        target_type = targetType;
        client_type = clientType;
        ip_address = ipAddress;
        created_at = createdAt;
    }
}
