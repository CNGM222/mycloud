package com.gm222.server.controller;

import com.gm222.server.model.dto.LoginRequest;
import com.gm222.server.model.dto.RegisterRequest;
import com.gm222.server.model.vo.ApiResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {
    @RequestMapping("/register")
    ApiResponse register (@RequestBody RegisterRequest registerRequest) {
        ApiResponse apiResponse = new ApiResponse();
        return apiResponse;
    }
    @RequestMapping("/login")
    ApiResponse login (@RequestBody LoginRequest loginRequest) {
        ApiResponse apiResponse = new ApiResponse();
        return apiResponse;
    }
    @RequestMapping("/logout")
    ApiResponse logout() {
        ApiResponse apiResponse = new ApiResponse();
        return apiResponse;
    }
}
