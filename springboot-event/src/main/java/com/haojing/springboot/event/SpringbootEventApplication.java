package com.haojing.springboot.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@SpringBootApplication
@EnableAsync // 使Async起作用
public class SpringbootEventApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEventApplication.class, args);
    }
}
