package com.gm222.server.controller;

import com.gm222.server.model.dto.*;
import com.gm222.server.model.vo.ApiResponse;
import com.gm222.server.model.vo.RegisterResult;
import com.gm222.server.service.AuthService;
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

    @RequestMapping("/register")
    ApiResponse<?> register (@RequestBody RegisterRequest registerRequest) {
        RegisterResult register = authService.register(registerRequest);
        ApiResponse<RegisterResult> apiResponse = new ApiResponse(666,"test",register);
        return null;
    }

    @RequestMapping("/login")
    ApiResponse<?> login (@RequestBody LoginRequest loginRequest) {
        ApiResponse<?> apiResponse = new ApiResponse();

        return apiResponse;
    }

    @RequestMapping("/logout")
    ApiResponse<?> logout() {
        ApiResponse<?> apiResponse = new ApiResponse();

        return apiResponse;
    }
}
