package com.gm222.server.service;

import com.gm222.server.dao.UserDao;
import com.gm222.server.model.dto.*;
import com.gm222.server.model.entity.users;
import com.gm222.server.model.enums.users.Role;
import com.gm222.server.model.enums.users.Status;
import com.gm222.server.model.vo.LoginResult;
import com.gm222.server.model.vo.RegisterResult;
import com.gm222.server.security.CurrentUser;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class AuthService {
    private final UserDao userDao;

    public AuthService(UserDao userDao) {
        this.userDao = userDao;
    }

    // 登录
    public LoginResult login(LoginRequest request, String clientType, String ip){
        return null;
    }
    // 注册
    public RegisterResult register(RegisterRequest request){        //testting
        LocalDateTime now = LocalDateTime.now();
        userDao.save(new users(null, request.getUsername(), request.getEmail(), request.getPassword(), Role.USER, 10000, 0, Status.NORMAL,now,now));
        Optional<users> result = userDao.findByEmailAndUsername(request.getEmail(), request.getUsername());
        return new RegisterResult(result.get().getId(),result.get().getUsername());
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
