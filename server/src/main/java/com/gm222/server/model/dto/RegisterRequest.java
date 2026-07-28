package com.gm222.server.model.dto;

import lombok.Data;

//注册请求结构体
@Data
public class RegisterRequest {
    private String username;
    private String email;
    private String password;
}
