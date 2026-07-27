package com.gm222.server.dao;

import com.gm222.server.model.entity.users;

import java.util.Optional;

public class UserDao {
    public static Optional<?> findByUsername(String username) {
        return Optional.empty();
    }

    public static Optional<?> findByEmail(String email) {
        return Optional.empty();
    }

    public static Optional<?> findByUsernameOrEmail(String aaa) {
        return Optional.empty();
    }

    public static long insert(users user) {
        return 0;
    }

    public static Optional<?> findById(long id) {
        return Optional.empty();
    }
}
