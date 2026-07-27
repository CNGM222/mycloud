package com.gm222.server.controller;

import com.gm222.server.model.dto.MoveRequest;
import com.gm222.server.model.dto.RenameRequest;
import com.gm222.server.model.vo.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FileController {

    public ApiResponse<?> listFiles(Long parentId,Long page,Long size) {
        return null;
    }

    public ApiResponse<?> upload(Long parentId,String file,String conflictPolicy) {
        return null;
    }

    public void download(Long id,String response){

    }

    public ApiResponse<?> rename(Long id, RenameRequest newName){
        return null;
    }

    public ApiResponse<?> move(Long id, MoveRequest newName){
        return null;
    }

    public ApiResponse<?> delete(Long id){
        return null;
    }
}
