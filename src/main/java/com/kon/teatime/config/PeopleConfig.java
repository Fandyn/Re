package com.kon.teatime.config;

import com.kon.teatime.entity.People;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //代表当前是一个配置类
public class PeopleConfig {
    @Bean(name = "mioqwq")       //构建一个实例放入spring容器中，若不指定名字，@Resource可以直接根据方法名找到该类,指定名字后该注解必须使用该名字才可以找到
    public People mi() {
        People people = new People();
        people.setId(001);
        people.setName("mio>v<");
        return people;
    }
}
