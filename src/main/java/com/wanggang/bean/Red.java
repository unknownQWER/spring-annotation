package com.wanggang.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class Red implements ApplicationContextAware,BeanNameAware,EmbeddedValueResolverAware {
    public void setBeanName(String name) {
        System.out.println("name="+name);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }

    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String s = resolver.resolveStringValue("你好${os.name},我是#{20*18}");
        System.out.println(s);
    }
}
