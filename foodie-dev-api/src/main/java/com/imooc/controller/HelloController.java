package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * program: foodie-dev
 * description: HelloController
 * *@author: gqchu
 * create: 2021-02-01 21:39
 **/
@RestController
public class HelloController {

    @GetMapping ("/hello")
    public String hello(){
        return "Hello World!";
    }
}
