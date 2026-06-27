package com.gm222.server.model.entity;

import com.gm222.server.model.enums.users.*;
import lombok.Data;

@Data
public class users {
    private long id;
    private String username;
    private String email;
    private String password_hash;
    private Role role;
    private long total_capacity;
    private long used_capacity;
    private Status status;
}
