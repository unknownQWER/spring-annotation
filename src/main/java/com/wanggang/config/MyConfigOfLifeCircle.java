package com.wanggang.config;

import com.wanggang.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

/**
 * bean的生命周期
 */
@Configuration
@PropertySource({"classpath:/person.properties"})
public class MyConfigOfLifeCircle {

    @Bean
    public Person person() {
        return new Person("lisi",8);
    }

    @Scope("singleton")
    //@Bean
    public Cat cat() {
        return new Cat();
    }

    //@Bean
    public Dog dog() {
        return new Dog();
    }

    //@Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}
