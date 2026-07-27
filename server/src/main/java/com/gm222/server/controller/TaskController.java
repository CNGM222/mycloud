package com.gm222.server.controller;

import com.gm222.server.model.vo.ApiResponse;
import com.gm222.server.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TaskController {
    @RequestMapping("/listtasks")
    public ApiResponse<?> listTasks(@RequestBody String status, @RequestBody int page, @RequestBody int size){
        return null;
    }

    @GetMapping("/gettask")
    public ApiResponse<?> getTask(@RequestParam String id){
        return null;
    }

    @RequestMapping("/cancel")
    public ApiResponse<?> cancel(@RequestBody String id){
        return null;
    }

    @RequestMapping("/retry")
    public ApiResponse<?> retry(@RequestBody String id){
        return null;
    }
}
