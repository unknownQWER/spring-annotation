package com.wanggang.condition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String property = context.getEnvironment().getProperty("os.name");
        BeanDefinitionRegistry registry = context.getRegistry();
        boolean person = registry.containsBeanDefinition("person");
        if (person) {
            return true;
        }
        return false;
    }
}
