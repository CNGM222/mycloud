package com.gm222.server.service;

import com.gm222.server.model.vo.UserProfileVo;
import com.gm222.server.security.CurrentUser;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserProfileVo getProfile(CurrentUser currentUser){
        return new UserProfileVo();
    }
}
