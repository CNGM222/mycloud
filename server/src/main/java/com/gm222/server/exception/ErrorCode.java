package com.gm222.server.exception;

public enum ErrorCode {

    // ========== 通用错误 (1xxx) ==========
    SUCCESS(1000, "操作成功"),
    SYSTEM_ERROR(1001, "系统繁忙，请稍后重试"),
    INVALID_PARAM(1002, "请求参数无效"),
    UNAUTHORIZED(1003, "未登录或登录已过期"),
    FORBIDDEN(1004, "无权限访问该资源"),
    REQUEST_TOO_FREQUENT(1005, "请求过于频繁，请稍后再试"),

    // ========== 用户模块 (2xxx) ==========
    USER_NOT_FOUND(2001, "用户不存在"),
    USER_ALREADY_EXISTS(2002, "用户已注册"),
    PASSWORD_ERROR(2003, "用户名或密码错误"),
    TOKEN_EXPIRED(2004, "登录凭证已过期，请重新登录"),
    TOKEN_INVALID(2005, "无效的登录凭证"),
    ACCOUNT_LOCKED(2006, "账户已被锁定，请联系管理员"),
    VERIFICATION_CODE_ERROR(2007, "验证码错误或已失效"),

    // ========== 文件与目录模块 (3xxx) ==========
    FILE_NOT_FOUND(3001, "文件不存在"),
    DIRECTORY_NOT_FOUND(3002, "目录不存在"),
    FILE_ALREADY_EXISTS(3003, "文件已存在，请勿重复上传"),
    DIRECTORY_ALREADY_EXISTS(3004, "目录已存在"),
    FILE_SIZE_EXCEEDED(3005, "文件大小超出限制"),
    FILE_TYPE_NOT_ALLOWED(3006, "不支持该文件类型"),
    FILE_UPLOAD_FAILED(3007, "文件上传失败，请重试"),
    FILE_DOWNLOAD_FAILED(3008, "文件下载失败，请重试"),
    FILE_DELETE_FAILED(3009, "文件删除失败"),
    DIRECTORY_CREATE_FAILED(3010, "目录创建失败"),
    DIRECTORY_DELETE_FAILED(3011, "目录删除失败（可能非空）"),
    PATH_INVALID(3012, "文件路径不合法"),
    FILE_READ_ERROR(3013, "文件读取异常"),
    FILE_WRITE_ERROR(3014, "文件写入异常"),
    RENAME_FAILED(3015, "文件或目录重命名失败"),
    MOVE_FAILED(3016, "文件或目录移动失败"),
    COPY_FAILED(3017, "文件或目录复制失败"),
    RECYCLE_NOT_EMPTY(3018, "回收站非空，请先清空"),

    // ========== 分享模块 (4xxx) ==========
    SHARE_NOT_FOUND(4001, "分享链接不存在或已取消"),
    SHARE_EXPIRED(4002, "分享链接已过期"),
    SHARE_PASSWORD_ERROR(4003, "分享提取码错误"),
    SHARE_LIMIT_EXCEEDED(4004, "分享次数已超过限制"),
    SHARE_ACCESS_DENIED(4005, "无权访问该分享"),
    SHARE_CREATE_FAILED(4006, "生成分享链接失败"),
    SHARE_SAVE_FAILED(4007, "保存到网盘失败，请重试"),

    // ========== 存储与配额模块 (5xxx) ==========
    STORAGE_NOT_ENOUGH(5001, "存储空间不足，请清理或升级"),
    STORAGE_QUOTA_EXCEEDED(5002, "超出存储配额上限"),
    STORAGE_ERROR(5003, "存储服务异常，请稍后重试"),
    QUERY_STORAGE_FAILED(5004, "查询存储信息失败");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    //根据错误码获取枚举实例（用于反查或路由）
    public static ErrorCode getByCode(int code) {
        for (ErrorCode errorCode : values()) {
            if (errorCode.getCode() == code) {
                return errorCode;
            }
        }
        return null;
    }

    //判断是否为成功状态（便于统一处理）
    public boolean isSuccess() {
        return this == SUCCESS;
    }
}
