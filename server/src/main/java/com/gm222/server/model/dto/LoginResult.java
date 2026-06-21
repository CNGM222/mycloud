package com.gm222.server.model.dto;

public class LoginResult <T> {
    private String token;
    private Integer expiresIn;
    private T user;
}
