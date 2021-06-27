package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * program: foodie-dev
 * description: HelloController
 * *@author: gqchu
 * create: 2021-02-01 21:39
 **/
@ApiIgnore
@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping ("/set")
    public String set(String key,String value){
        redisTemplate.opsForValue().set(key,value);
        return "OK";
    }

    @GetMapping ("/get")
    public String get(String key){
        return (String) redisTemplate.opsForValue().get(key);
    }

    @GetMapping ("/delete")
    public String delete(String key){
        redisTemplate.delete(key);
        return "OK";
    }
}
