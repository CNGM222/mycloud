package com.gm222.server.service;

import com.gm222.server.dao.OperationLogDao;
import com.gm222.server.dao.UserDao;
import com.gm222.server.exception.BusinessException;
import com.gm222.server.exception.ErrorCode;
import com.gm222.server.model.dto.*;
import com.gm222.server.model.entity.operation_logs;
import com.gm222.server.model.entity.users;
import com.gm222.server.model.vo.LoginResult;
import com.gm222.server.model.vo.RegisterResult;
import com.gm222.server.security.CurrentUser;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class AuthService {
    private final UserDao userDao;
    private final PasswordEncoder passwordEncoder;
    private final OperationLogDao operationLogDao;

    public AuthService(UserDao userDao, PasswordEncoder passwordEncoder, OperationLogDao operationLogDao) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
        this.operationLogDao = operationLogDao;
    }

    // 登录
    public LoginResult login(LoginRequest request, String clientType, String ip){
        return null;
    }

    // 注册
    public RegisterResult register(RegisterRequest request){
        //检查用户名或邮箱是否重复
        Optional<users> checkUsername = userDao.findByUsername(request.getUsername());
        Optional<users> checkEmail = userDao.findByEmail(request.getEmail());
        if(checkUsername.isPresent()){
            throw new BusinessException(ErrorCode.USER_ALREADY_EXISTS);
        } else if (checkEmail.isPresent()) {
            throw new BusinessException(ErrorCode.EMAIL_ALREADY_EXISTS);
        }

        //写入用户登录信息
        LocalDateTime now = LocalDateTime.now();
        userDao.save(new users(null, request.getUsername(), request.getEmail(), request.getPassword(), "user", 10000, 0, "normal",now,now));
        Optional<users> result = userDao.findByEmailAndUsername(request.getEmail(), request.getUsername());
        if(result.isEmpty()){
            throw new BusinessException(ErrorCode.SYSTEM_ERROR);
        }

        //写入日志
        now = LocalDateTime.now();
        operationLogDao.save(new operation_logs(null,result.get().getId(),"register",result.get().getId(),"user",null,"localhost",now));

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
