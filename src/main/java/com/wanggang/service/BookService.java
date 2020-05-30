package com.wanggang.service;

import com.wanggang.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void print() {
        System.out.println("bookdao="+bookDao.label);
    }
}
