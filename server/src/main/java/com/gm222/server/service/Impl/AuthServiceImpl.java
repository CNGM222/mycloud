package com.gm222.server.service.Impl;

import com.gm222.server.model.dto.*;
import com.gm222.server.service.AuthService;

public class AuthServiceImpl implements AuthService {
    @Override
    public  LoginResult login(LoginRequest loginRequest) {
        return null;
    }

    //测试中
    @Override
    public RegisterResult register(RegisterRequest registerRequest) {
        return new RegisterResult(registerRequest.getUsername(), registerRequest.getPassword());
    }
}
