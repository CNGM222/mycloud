package com.gm222.server.controller;

import com.gm222.server.model.dto.*;
import com.gm222.server.model.vo.ApiResponse;
import com.gm222.server.model.vo.RegisterResult;
import com.gm222.server.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    ApiResponse<?> register (@RequestBody RegisterRequest registerRequest) {
        RegisterResult register = authService.register(registerRequest);
        return new ApiResponse<>(666,"test",register);
    }

    @PostMapping("/login")
    ApiResponse<?> login (@RequestBody LoginRequest loginRequest) {
        ApiResponse<?> apiResponse = new ApiResponse();

        return apiResponse;
    }

    @PostMapping("/logout")
    ApiResponse<?> logout() {
        ApiResponse<?> apiResponse = new ApiResponse();

        return apiResponse;
    }
}
