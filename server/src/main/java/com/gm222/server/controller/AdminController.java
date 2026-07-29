package com.gm222.server.controller;

import com.gm222.server.model.dto.AdminRequest;
import com.gm222.server.model.vo.ApiResponse;
import com.gm222.server.security.JwtTokenProvider;
import com.gm222.server.service.AdminService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;
    private final JwtTokenProvider jwtTokenProvider;

    public AdminController(AdminService adminService,JwtTokenProvider jwtTokenProvider) {
        this.adminService = adminService;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @GetMapping("/users")
    public ApiResponse<?> listUsers(
            @RequestHeader RequestHeader header,
            @RequestParam(required = false) String keyword,
            @RequestParam(defaultValue = "1") Long page,
            @RequestParam(defaultValue = "15") Long size) {
        return null;
    }

    @GetMapping("/user/{id}")
    public ApiResponse<?> getUser(
            @RequestHeader RequestHeader header,
            @PathVariable Long id) {
        return null;
    }

    @PutMapping("/userstatus/{id}")
    public ApiResponse<?> updateUserStatus(
            @RequestHeader RequestHeader header,
            @PathVariable Long id,
            @RequestBody AdminRequest request) {
        return null;
    }

    @PutMapping("/usercapacity/{id}")
    public ApiResponse<?> updateUserCapacity(
            @RequestHeader RequestHeader header,
            @PathVariable Long id,
            @RequestBody AdminRequest request) {
        return null;
    }

    @GetMapping("/storage")         //查看存储情况
    public ApiResponse<?> storage(
            @RequestHeader RequestHeader header) {
        return null;
    }

    @RequestMapping("/logs")
    public ApiResponse<?> logs(
            @RequestHeader RequestHeader header) {
        return null;
    }
}
