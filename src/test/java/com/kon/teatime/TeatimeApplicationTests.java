package com.kon.teatime;

import com.kon.teatime.entity.User;
import com.kon.teatime.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TeatimeApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private com.kon.teatime.mapper.UserMapper UserMapper;

    @Test
    void findAll() {
        List<User> list = UserMapper.findAll();
        for (User air : list) {
            System.out.println(air);
        }
    }
}