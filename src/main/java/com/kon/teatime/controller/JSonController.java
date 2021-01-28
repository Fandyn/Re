package com.kon.teatime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@Controller
public class JSonController {
    @GetMapping("/test1")//此处为映射地址,不能与已存在的重复
    public String testDemo(Model model){
        model.addAttribute("name","不会吧？");
        return "test1";//返回的为文件名 file [/WEB-INF/jsp/不是吧？.jsp] not found 此处为返回至某个文件
    }

    @RequestMapping(value = "/json")//默认post与get都可以
    public String index( Model v){
        System.out.println("已执行");
        return "json";
    }

    @PostMapping("/json")
    @ResponseBody
    public Map<String,Object> getJsonVal(@RequestBody Map<String,Object> user) {
        System.out.println("user = " + user.get("code"));
        System.out.println("user = " + user.get("name"));
        return user;
    }

}
