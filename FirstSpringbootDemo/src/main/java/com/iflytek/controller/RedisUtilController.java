package com.iflytek.controller;

import com.iflytek.entity.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisUtilController {
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/set")
    public String set(String key,String value){
        try {
            redisUtil.set(key, value);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    @GetMapping("/get")
    public String get(String key){
        return redisUtil.get(key);
    }
}