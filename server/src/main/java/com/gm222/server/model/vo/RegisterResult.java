package com.gm222.server.model.vo;

//注册返回结果结构体
public class RegisterResult {
    private Long userId;
    private String username;

    public RegisterResult() {
        this.userId = 114514L;
        this.username = "aaa";
    }
    public RegisterResult(Long userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
