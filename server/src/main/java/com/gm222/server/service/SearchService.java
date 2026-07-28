package com.gm222.server.service;

import com.gm222.server.model.vo.PageResult;
import com.gm222.server.security.CurrentUser;
import org.springframework.stereotype.Service;

import javax.naming.directory.SearchResult;

@Service
public class SearchService {
    public PageResult search(CurrentUser currentuser, SearchResult searchresult){
        return null;
    }
}
