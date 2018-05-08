package cn.zjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public Map hello(){
        Map map=new HashMap<>();
        map.put("id","123");
        map.put("name","张三");
        return map;
    }
}
