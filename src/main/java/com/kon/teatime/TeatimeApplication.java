package com.kon.teatime;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

@MapperScan(basePackages = "com.kon.teatime.mapper")

public class TeatimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeatimeApplication.class, args);
    }

}
