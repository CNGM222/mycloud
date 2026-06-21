package com.gm222.server.model.vo;

public class ApiResponse <T> {
    private int code;
    private String message;
    private T data;
}

//    code	含义
//    0	成功
//    40000	参数错误
//    40001	未登录或登录已过期
//    40003	权限不足
//    40004	资源不存在
//    40009	文件名冲突
//    40010	容量不足
//    40011	文件大小超过限制
//    50000	系统内部错误