package com.haojing.springboot.event.async;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author haoj
 * @date 2019/12/10
 */
@Component // 扫描类到容器中
public class AsyncListener implements ApplicationListener<AsyncEvent> {
    @Async
    @Override
    public void onApplicationEvent(AsyncEvent asyncEvent) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(asyncEvent.getMsg());
    }
}
