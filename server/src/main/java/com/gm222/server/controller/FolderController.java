package com.gm222.server.controller;

import com.gm222.server.model.dto.CreatFolderRequest;
import com.gm222.server.model.vo.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FolderController {
    @RequestMapping("/creatfolder")
    public ApiResponse<?> creatFolder(CreatFolderRequest newName){
        return null;
    }
}
