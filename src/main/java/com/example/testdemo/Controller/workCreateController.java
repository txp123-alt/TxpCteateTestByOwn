package com.example.testdemo.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/createWork")
@Slf4j
public class workCreateController {

    @PostMapping("/firstCreate")
    public ResponseEntity<String> ctrateWork(@RequestBody String requestMessage){
        log.info("接收到请求:{}",requestMessage);
        return ResponseEntity.ok("success");
    }
}
