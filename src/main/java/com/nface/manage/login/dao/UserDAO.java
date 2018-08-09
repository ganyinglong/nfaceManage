package com.nface.manage.login.dao;

import com.nface.manage.login.dto.UserDTO;

public interface UserDAO {

    /**
     * 注册新用户
     * @param user
     */
    void register(UserDTO user);
}
