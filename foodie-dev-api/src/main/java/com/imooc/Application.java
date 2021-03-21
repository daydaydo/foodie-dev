package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * program: foodie-dev
 * description: Application
 * *@author: gqchu
 * create: 2021-02-01 21:20
 **/
@SpringBootApplication
// 扫描 mybatis 通用 mapper 所在的包
@MapperScan(basePackages = "com.imooc.mapper")
// 扫描所有包以及相关组件包
@ComponentScan(basePackages = {"com.imooc", "org.n3r.idworker"})
@EnableScheduling       // 开启定时任务
public class Application {

    public static void main(String[] args) {
        //启动类入口
        SpringApplication.run(Application.class,args);
    }
}
