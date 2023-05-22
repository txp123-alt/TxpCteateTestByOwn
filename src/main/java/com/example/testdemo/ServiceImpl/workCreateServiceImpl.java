package com.example.testdemo.ServiceImpl;

import com.example.testdemo.Service.workCreateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class workCreateServiceImpl implements workCreateService {

    @Override
    public void createWork(String requestMessage) {
        log.info("接收到请求:{}",requestMessage);
    }
}
