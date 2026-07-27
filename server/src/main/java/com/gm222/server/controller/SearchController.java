package com.gm222.server.controller;

import com.gm222.server.model.vo.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SearchController {
    @GetMapping("/search")
    public ApiResponse<?> search(@RequestParam String keyword) {
        return null;
    }
}
