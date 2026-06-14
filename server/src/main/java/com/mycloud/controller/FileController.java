package com.mycloud.controller;

import com.mycloud.entity.FileEntity;
import com.mycloud.entity.result;
import com.mycloud.service.FileService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/files")
public class FileController {
    private final FileService fileService = new FileService();

    @PostMapping("/upload")
    public result upload(@RequestBody UploadRequest request) {
        return fileService.SaveFile(request.getFileData(), request.getUserId());
    }

    @GetMapping("/{fileId}/download")
    public result download(
            @PathVariable String fileId,
            @RequestParam long userId) {
        return fileService.getFileStream(fileId, userId);
    }

    @GetMapping("/{fileId}/preview")
    public result preview(
            @PathVariable String fileId,
            @RequestParam long userId) {
        return fileService.createPreview(fileId, userId);
    }

    @PostMapping("/manage")
    public result manage(@RequestBody ManageRequest request) {
        return fileService.manageFile(request.getCommand(), request.getUserId());
    }

    public static class UploadRequest {
        private FileEntity fileData;
        private long userId;

        public FileEntity getFileData() {
            return fileData;
        }

        public void setFileData(FileEntity fileData) {
            this.fileData = fileData;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }
    }

    public static class ManageRequest {
        private String command;
        private long userId;

        public String getCommand() {
            return command;
        }

        public void setCommand(String command) {
            this.command = command;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }
    }
}
