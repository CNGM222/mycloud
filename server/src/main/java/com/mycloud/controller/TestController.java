package com.mycloud.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
