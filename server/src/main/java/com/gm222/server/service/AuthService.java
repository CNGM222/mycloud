package com.gm222.server.service;

import com.gm222.server.model.dto.*;
import com.gm222.server.model.vo.LoginResult;
import com.gm222.server.model.vo.RegisterResult;
import com.gm222.server.security.CurrentUser;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    // 登录
    public LoginResult login(LoginRequest request, String clientType, String ip){
        return null;
    }
    // 注册
    public RegisterResult register(RegisterRequest request){
        return null;
    }
    // 登出
    public void logout(CurrentUser currentUser, String clientType, String ip){
        return;
    }
    // 解析token
    public CurrentUser praseToken(String token){
        return null;
    }
}
