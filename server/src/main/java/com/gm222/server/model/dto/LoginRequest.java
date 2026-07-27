package com.gm222.server.model.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String account;
    private String password;
}
