package com.example.testdemo.ControllerAdvice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局异常处理
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> resolveMyControllerException(Exception e){
        return ResponseEntity.status(500).body("请求异常，异常信息为："+e.getMessage());
    }

}
