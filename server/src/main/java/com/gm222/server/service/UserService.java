package com.gm222.server.service;

import com.gm222.server.model.vo.UserProfileVo;
import com.gm222.server.security.CurrentUser;

public class UserService {
    public static UserProfileVo getProfile(CurrentUser currentUser){
        return new UserProfileVo();
    }
}
