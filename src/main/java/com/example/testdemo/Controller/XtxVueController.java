package com.example.testdemo.Controller;

import com.example.testdemo.Service.XtxVueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("XtxVueServer")
@CrossOrigin
@Slf4j
public class XtxVueController {

    @Autowired
    private XtxVueService xtxVueService;


    //小兔鲜Head商品分类
    @GetMapping("home/category/head")
    public ResponseEntity<String> getCategoryHead(){

        String resultStr = xtxVueService.getHeadCategory();
        log.info("获取Home分类数据");
        return ResponseEntity.ok(resultStr);
    }

    //小兔鲜Head商品分类
    @GetMapping("home/banner")
    public ResponseEntity<String> getBannerHead(){
        String resultStr = xtxVueService.getBannerHead();
        log.info("获取Home轮播数据");
        return ResponseEntity.ok(resultStr);
    }
}
