package com.gm222.server.service;

import com.gm222.server.model.dto.CreatFolderRequest;
import com.gm222.server.model.dto.MoveRequest;
import com.gm222.server.model.dto.RenameRequest;
import com.gm222.server.model.vo.FileItemVO;
import com.gm222.server.model.vo.PageResult;
import com.gm222.server.security.CurrentUser;
import org.springframework.stereotype.Service;

@Service
public class FileService {
    public PageResult listFiles(CurrentUser currentUser){
        return null;
    }

    public FileItemVO createFolder(CurrentUser currentUser, CreatFolderRequest newName){
        return null;
    }

    public FileItemVO upload(CurrentUser currentUser, String UploadContext){
        return null;
    }

    public void download(CurrentUser currentUser, Long id, String DownloadContext){
    }

    public FileItemVO rename(CurrentUser currentUser, Long id, RenameRequest renameRequest){
        return null;
    }

    public FileItemVO move(CurrentUser currentUser, Long id, MoveRequest moveRequest){
        return null;
    }

    public void delete(CurrentUser currentUser, Long id){

    }
}
