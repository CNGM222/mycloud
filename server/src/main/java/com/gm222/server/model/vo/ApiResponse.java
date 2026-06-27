package com.gm222.server.model.vo;

public class ApiResponse <T> {
    private int code;
    private String message;
    private T data;

    public ApiResponse() {
    }
    public ApiResponse(int i, String testString, T registerResult) {
        this.code = i;
        this.message = testString;
        this.data = registerResult;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
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