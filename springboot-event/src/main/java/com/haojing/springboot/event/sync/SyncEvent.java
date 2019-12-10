package com.haojing.springboot.event.sync;

import org.springframework.context.ApplicationEvent;

/**
 * @author haoj
 * @date 2019/12/10
 */
public class SyncEvent extends ApplicationEvent {
    private String msg;



    public SyncEvent(Object source) {
        super(source);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
