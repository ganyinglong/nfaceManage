package com.nface.manage.login.dao;

import com.nface.manage.login.dto.UserDTO;

import java.util.Map;

public interface UserDAO {

    /**
     * 注册新用户
     * @param user
     */
    void register(UserDTO user);

    /**
     * 删除用户
     * @param userName
     */
    void removeUser(String userName);

    UserDTO querUser(Map<String,String> para);

    int countUser(Map<String,String> para);
}
