package cn.zjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
public class HelloController {

    @RequestMapping("/hello")
    public Map hello(){
        Map<String, String> map=new HashMap<>();
        map.put("id","123");
        map.put("name","张三");
        map.put("address","北京");
        map.put("phone", "1234567");
        map.put("id1","123");
        map.put("name1","张三");
        map.put("address1","北京");
        return map;
    }
}
