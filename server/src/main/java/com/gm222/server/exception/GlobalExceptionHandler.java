package com.gm222.server.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<Map<String, Object>> handleBusiness(BusinessException e) {
        ErrorCode errorCode = e.getErrorCode();
        Map<String, Object> resp = new HashMap<>();
        resp.put("code", errorCode.getCode());
        resp.put("message", e.getMessage());
        resp.put("data", null);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(resp);
    }
}