package com.gm222.server.service;

import com.gm222.server.model.dto.CreatFolderRequest;
import com.gm222.server.model.dto.MoveRequest;
import com.gm222.server.model.dto.RenameRequest;
import com.gm222.server.model.vo.FileItemVO;
import com.gm222.server.model.vo.PageResult;
import com.gm222.server.security.CurrentUser;

public class FileService {
    public static PageResult listFiles(CurrentUser currentUser){
        return null;
    }

    public static FileItemVO createFolder(CurrentUser currentUser, CreatFolderRequest newName){
        return null;
    }

    public static FileItemVO upload(CurrentUser currentUser, String UploadContext){
        return null;
    }

    public static void download(CurrentUser currentUser, Long id, String DownloadContext){
    }

    public static FileItemVO rename(CurrentUser currentUser, Long id, RenameRequest renameRequest){
        return null;
    }

    public static FileItemVO move(CurrentUser currentUser, Long id, MoveRequest moveRequest){
        return null;
    }

    public static void delete(CurrentUser currentUser, Long id){

    }
}
