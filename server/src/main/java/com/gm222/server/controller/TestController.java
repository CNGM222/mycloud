package com.gm222.server.controller;

import com.gm222.server.model.dto.RegisterResult;
import com.gm222.server.model.dto.TestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/test")
    public TestDto Test() {
        return new TestDto("testString", new RegisterResult("testID","testname"));
    }
}
