package cn.zjy.controller;

import cn.zjy.pojo.User;
import cn.zjy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    //注入UserService
    @Autowired
    private UserService userService;

    //查询所有用户信息
    @RequestMapping("/findAll")
    public List<User> findAllUser(){
        List<User> userList = userService.findAllUser();
        return userList;
    }

}
