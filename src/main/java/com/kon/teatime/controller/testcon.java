package com.kon.teatime.controller;

import com.kon.teatime.entity.People;
import com.kon.teatime.properties.AliyunProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class testcon {

    @Resource(name = "mioqwq")
//    @Autowired
    //以上两者均可找到spring容器中放入的mio类，但第一个必须是指定的名称才可以被找到
    private People people;

    @GetMapping("/test")
    public String test() {
        return "hello springboot";
    }

    @GetMapping("/mio")
    public People mio() {
        return people;
    }

    @Value("${picPath}")
    private String picPath;

    @GetMapping("/picPath")
    public String picPath() {
        return picPath;
    }

    @Autowired
    private AliyunProperties aliyunProperties;

    @GetMapping("/aliyun")
    public AliyunProperties aliyunP() {
        return aliyunProperties;
    }

}
