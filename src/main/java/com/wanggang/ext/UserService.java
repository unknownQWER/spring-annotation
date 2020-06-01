package com.wanggang.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

public class UserService {

    @EventListener(classes = ApplicationEvent.class)
    public void listen(ApplicationEvent applicationEvent) {

        System.out.println("UserService监听到的事件:"+applicationEvent);
    }
}
