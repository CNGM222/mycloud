package com.gm222.server.model.dto;

import lombok.Data;

@Data
public class RequestHeader {
    private String Authorization;
    private String ClientType;
    //private String ip;
}
