package cn.zjy.service;

import cn.zjy.dao.UserMapper;
import cn.zjy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    //注入UserMapper
    @Autowired
    private UserMapper userMapper;

    //查询所有的用户列表
    public List<User> findAllUser(){
        List<User> userList = userMapper.findAll();
        return userList;
    }
}
