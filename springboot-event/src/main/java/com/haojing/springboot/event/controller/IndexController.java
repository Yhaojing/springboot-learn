package com.haojing.springboot.event.controller;

import com.haojing.springboot.event.async.AsyncEvent;
import com.haojing.springboot.event.sync.SyncEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haoj
 * @date 2019/12/10
 */
@RestController
public class IndexController {
    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/sync")
    public String syncEvent() {
        System.out.println("进入同步");
        SyncEvent event = new SyncEvent(this);
        event.setMsg("hello sync");
        System.out.println("进入异步");
        AsyncEvent event1 = new AsyncEvent(this);
        event1.setMsg("hello sync");
        applicationContext.publishEvent(event);
        event1.setMsg("hello async");
        applicationContext.publishEvent(event1);
        System.out.printf("结束");
        return "success";
    }
}
