package com.wanggang.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean,DisposableBean {
    public Cat() {
        System.out.println("cat--------construct");
    }

    public void destroy() throws Exception {
        System.out.println("cat--------destory");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("cat--------init");
    }
}
