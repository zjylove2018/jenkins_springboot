package cn.zjy.dao;

import cn.zjy.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    //查询所有的用户列表
    public List<User> findAll();
}
