package com.mk.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/getGN")
    private Object getGoodNames(){
        JSONObject json = new JSONObject();
        json.put("1","pingguo");
        return json;
    }
}
