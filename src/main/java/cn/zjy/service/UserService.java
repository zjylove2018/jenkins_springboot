package cn.zjy.service;

import cn.zjy.pojo.User;

import java.util.List;

public interface UserService {
    //查询所有的用户列表
    public List<User> findAllUser();
}
