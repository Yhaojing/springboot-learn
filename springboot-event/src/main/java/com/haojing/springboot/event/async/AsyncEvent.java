package com.haojing.springboot.event.async;

import org.springframework.context.ApplicationEvent;

/**
 * @author haoj
 * @date 2019/12/10
 */
public class AsyncEvent extends ApplicationEvent {
    private String msg;

    public AsyncEvent(Object source) {
        super(source);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
