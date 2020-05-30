package com.wanggang.condition;

import com.wanggang.bean.Rainbow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImporDefinitionRegister implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean contain = registry.containsBeanDefinition("color");
        boolean contain2 = registry.containsBeanDefinition("red");
        if (contain && contain2) {
            RootBeanDefinition definition = new RootBeanDefinition(Rainbow.class);
            registry.registerBeanDefinition("rainbow",definition);
        }
    }
}
