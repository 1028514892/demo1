package com.example.demo;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

/**
 * @author xiaoxin
 * @date 2020/3/16 - 13:48
 */
@SpringBootTest
public class TT {
    @Autowired
    UserMapper userMapper;
    @Test
    public void aa(){
//        System.out.println(dataSource.getClass());
        User u = new User();
        u.setName("123");
        u.setBio("444");
        userMapper.insertUser(u);
    }
}
