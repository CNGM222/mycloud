package com.gm222.server.model.vo;

public class LoginResult <T> {
    private String token;       //JWT令牌
    private Integer expiresIn;  //过期时间
    private T user;             //用户信息

    public LoginResult() {}
    public LoginResult(String token, Integer exp, T user) {
        this.token = token;
        this.user = user;
        this.expiresIn = exp;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public T getUser() {
        return user;
    }
    public void setUser(T user) {
        this.user = user;
    }
}
