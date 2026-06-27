package com.gm222.server.model.dto;

import java.util.UUID;

public class RegisterResult {
    private String userId;
    private String username;

    public RegisterResult() {
        this.userId = "114514";
        this.username = "aaa";
    }
    public RegisterResult(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
