package com.gm222.server.controller;

import com.gm222.server.model.vo.ApiResponse;
import com.gm222.server.security.CurrentUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/profile")
    public ApiResponse<?> profile(CurrentUser currentUser) {
        return null;
    }
}
