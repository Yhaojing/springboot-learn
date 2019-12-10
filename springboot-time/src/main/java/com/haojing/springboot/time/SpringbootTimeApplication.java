package com.haojing.springboot.time;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 程序主入口，主启动类，也是一个组件，负责启动项目：自动配置，扫描应用
 * springboot 应用
 */
@SpringBootApplication
@EnableScheduling // 开启对于计划任务的支持
public class SpringbootTimeApplication {

    public static void main(String[] args) {
        /**
         * 开启了一个服务
         */
        SpringApplication.run(SpringbootTimeApplication.class, args);
    }

}
