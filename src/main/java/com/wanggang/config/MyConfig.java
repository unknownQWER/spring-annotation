package com.wanggang.config;

import com.wanggang.bean.Color;
import com.wanggang.bean.ColorFactoryBean;
import com.wanggang.bean.Person;
import com.wanggang.condition.MyImporDefinitionRegister;
import com.wanggang.condition.MyImportSelector;
import com.wanggang.condition.WindowsCondition;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value = "com.wanggang")
//@Import(MyImportSelector.class)
@Import(MyImporDefinitionRegister.class)
public class MyConfig {

    //@Bean("person")
    @Scope("singleton")
    @Lazy
    public Person getPerson() {
        System.out.println("创建了person");
        return new Person("lisi", 28);
    }

    @Bean("bill")
    @Conditional({WindowsCondition.class})
    public Person person1() {
        return new Person("bill", 10);
    }

    @Bean("linux")
    public Person person2() {
        return new Person("linux", 20);
    }

    @Bean
    public FactoryBean factoryBean() {
        return new ColorFactoryBean();
    }
}
