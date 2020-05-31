package com.wanggang.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertUser() {
        String sql="INSERT INTO t_user (username,`password`) VALUES(?,?)";
        jdbcTemplate.update(sql,UUID.randomUUID().toString().substring(0,5),UUID.randomUUID().toString().substring(0,5));
    }
}
