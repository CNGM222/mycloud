package com.gm222.server.model.vo;

import com.gm222.server.model.enums.users.Role;
import com.gm222.server.model.enums.users.Status;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserProfileVo {
    private long id;
    private String username;
    private String email;
    private Role role;
    private long total_capacity;
    private long used_capacity;
    private Status status;
    private LocalDateTime created_at;
}
