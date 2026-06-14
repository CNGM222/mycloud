package com.mycloud.controller;

import com.mycloud.entity.User;
import com.mycloud.entity.result;
import com.mycloud.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService = new AuthService();

    @PostMapping("/login")
    public result login(@RequestBody LoginRequest request) {
        return authService.authenticate(request.getAccount(), request.getPassword());
    }

    @PostMapping("/register")
    public result register(@RequestBody User request) {
        return authService.registerUser(request);
    }

    @PostMapping("/logout")
    public result logout(
            @RequestHeader(value = "Authorization", required = false) String authorization,
            @RequestParam(value = "token", required = false) String token) {
        return authService.destroySession(resolveToken(authorization, token));
    }

    private String resolveToken(String authorization, String token) {
        if (authorization != null && authorization.startsWith("Bearer ")) {
            return authorization.substring(7);
        }
        return token;
    }

    public static class LoginRequest {
        private String account;
        private String password;

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
