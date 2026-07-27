package com.gm222.server.model.dto;

import lombok.Data;

@Data
public class RequestHead {
    private String JWT;
    private String X_Client_Type;
}