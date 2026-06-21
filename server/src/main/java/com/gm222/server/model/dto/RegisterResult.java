package com.gm222.server.model.dto;

public class RegisterResult {
    private String userId;
    private String username;
    public RegisterResult(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }
}
