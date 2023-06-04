package com.example.testdemo.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("XtxVueServer")
@CrossOrigin
public class XtxVueController {

    @GetMapping("home/category/head")
    public ResponseEntity<String> getCategoryHead(){

        ArrayList<JSONObject> objects = new ArrayList<>();
        JSONObject jsonObject0 = new JSONObject();
        jsonObject0.put("id","1005000");
        jsonObject0.put("name","居家");
        jsonObject0.put("picture","http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/picture/2021-05-06/201516e3-25d0-48f5-bcee-7f0cafb14176.png");
        jsonObject0.put("name","居家");

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("id","1005002");
        jsonObject1.put("name","美食");

        objects.add(jsonObject0);
        objects.add(jsonObject1);
        return ResponseEntity.ok(JSON.toJSONString(objects));
    }
}
