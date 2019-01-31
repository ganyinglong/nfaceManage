package com.nface.manage.login.service;

import com.nface.manage.login.dto.UserDTO;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface LoginService {
    boolean register(UserDTO user);

    boolean removeUser(String userName);

    Map<String,Object> login(HttpServletRequest request);
}
