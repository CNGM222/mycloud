package com.mycloud.repository;

import com.mycloud.entity.User;

public interface UserRepository {
    public User findByAccount(String account);
    public int save(User user);
}
