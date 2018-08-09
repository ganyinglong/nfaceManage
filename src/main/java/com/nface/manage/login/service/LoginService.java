package com.nface.manage.login.service;

import com.nface.manage.login.dto.UserDTO;

public interface LoginService {
    boolean register(UserDTO user);
}
