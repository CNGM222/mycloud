package com.gm222.server.controller;

import com.gm222.server.model.dto.*;
import com.gm222.server.model.vo.ApiResponse;
import com.gm222.server.model.vo.RegisterResult;
import com.gm222.server.service.AuthService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {
    @RequestMapping("/register")
    ApiResponse<?> register (@RequestBody RegisterRequest registerRequest) {
        RegisterResult register = AuthService.register(registerRequest);
        return new ApiResponse<>(0, "success", register);
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
