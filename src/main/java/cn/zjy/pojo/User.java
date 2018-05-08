package cn.zjy.pojo;

import java.io.Serializable;

/*
登录用户的实体类
*/
public class User implements Serializable{

//主键id
private String u_id;
//用户名
private String username;
//密码
private String password;
//手机号
private String telphone;
//姓名
private String name;

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getTelphone() {
    return telphone;
}

public void setTelphone(String telphone) {
    this.telphone = telphone;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
    @Override
    public String toString() {
        return "User{" +
                "u_id='" + u_id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", telphone='" + telphone + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
