package com.mycloud.entity;

public class result {
    private int code;           //返回代码
    private String message;     //返回消息

    public result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
