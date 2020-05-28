package com.wanggang.bean.test;

import com.wanggang.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class HHtest {
    public static void main(String[] args) {

        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        ConfigurableEnvironment environment = context.getEnvironment();
        Object bill = context.getBean("bill");
        System.out.println(bill);
    }
}
