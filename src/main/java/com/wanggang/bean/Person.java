package com.wanggang.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Value("${name}")
    private String name;

    @Value("9")
    private int age;
}
