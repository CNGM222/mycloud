package com.gm222.server.service;

import com.gm222.server.model.vo.PageResult;
import com.gm222.server.model.vo.TaskVO;
import com.gm222.server.security.CurrentUser;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    public PageResult listTasks(CurrentUser currentUser,String status,int page,int size){
        return null;
    }

    public TaskVO getTask(CurrentUser currentUser,Long id){
        return null;
    }

    public void cancelTask(CurrentUser currentUser,Long id){
    }

    public void retryTask(CurrentUser currentUser,Long id){
    }
}
