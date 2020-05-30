package com.wanggang.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        System.out.println("MyBeanPostProcessor.......constructor");
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization...."+"beanName:"+beanName
        +".....bean:"+bean);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization...."+"beanName:"+beanName
                +".....bean:"+bean);
        return bean;
    }
}
