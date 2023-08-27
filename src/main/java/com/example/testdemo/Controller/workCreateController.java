package com.example.testdemo.Controller;

import com.example.testdemo.Service.workCreateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/createWork")
@Slf4j
@CrossOrigin
public class workCreateController {

    @Autowired
    private workCreateService workCreateService;

    @GetMapping("/firstCreate")
    public ResponseEntity<String> ctrateWork(){
        workCreateService.createWork("requestMessage");
        return ResponseEntity.ok("success");
    }
}
