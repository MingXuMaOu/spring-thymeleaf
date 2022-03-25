package com.itherma.controller;

import com.itherma.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("hello","hello welcome");

        List<User> users = new ArrayList<>();
        users.add(new User(1,"张三","深圳"));
        users.add(new User(2,"李四","北京"));
        users.add(new User(3,"王五","武汉"));
        model.addAttribute("users",users);

        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("No","123");
        dataMap.put("address","深圳");
        model.addAttribute("dataMap",dataMap);

        String[] names = {"张三","李四","王五"};
        model.addAttribute("names",names);

        model.addAttribute("now",new Date());

        model.addAttribute("age",22);

        model.addAttribute("class1","aaa");
        model.addAttribute("class2","bbb");
        return "demo1";
    }

}
