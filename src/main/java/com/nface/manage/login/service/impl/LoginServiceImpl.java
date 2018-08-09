package com.nface.manage.login.service.impl;

import com.nface.manage.login.dao.UserDAO;
import com.nface.manage.login.dto.UserDTO;
import com.nface.manage.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserDAO userDAO;

    public boolean register(UserDTO user) {
        userDAO.register(user);
        return true;
    }

}
