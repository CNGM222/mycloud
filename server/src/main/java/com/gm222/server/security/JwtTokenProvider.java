package com.gm222.server.security;

import com.gm222.server.model.entity.users;
import org.springframework.stereotype.Service;

@Service
public class JwtTokenProvider {
    public static String generateToken(users user) {
        return null;
    }

    public static CurrentUser parseToken(String token) {
        return null;
    }

    public static boolean validateToken(String token) {
        return false;
    }
}
