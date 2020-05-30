package com.wanggang.dao;

import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDao3 implements BookDao {

    public String label = "3";
}
