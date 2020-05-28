package com.wanggang.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        String[] a =  {"com.wanggang.bean.Red","com.wanggang.bean.Color"};
        return a;
    }
}
