package com.kon.teatime.mapper;

import com.kon.teatime.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void findAll() {
        System.out.println("首次修改>v<");
        List<User> list = userMapper.findAll();
        for (User air : list) {
            System.out.println(air);
        }
    }
}