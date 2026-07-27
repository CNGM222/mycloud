package com.gm222.server.service;

import com.gm222.server.model.vo.PageResult;
import com.gm222.server.model.vo.TaskVO;
import com.gm222.server.security.CurrentUser;

public class TaskService {
    public static PageResult listTasks(CurrentUser currentUser,String status,int page,int size){
        return null;
    }

    public static TaskVO getTask(CurrentUser currentUser,Long id){
        return null;
    }

    public static void cancelTask(CurrentUser currentUser,Long id){
    }

    public static void retryTask(CurrentUser currentUser,Long id){
    }
}
