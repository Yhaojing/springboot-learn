package com.haojing.springboot.event.sync;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author haoj
 * @date 2019/12/10
 */
@Component // 扫描类到spring容器中
public class SyncListener implements ApplicationListener<SyncEvent> {
    @Override
    public void onApplicationEvent(SyncEvent syncEvent) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(syncEvent.getMsg());
    }
}
