package com.nface.manage.login.service.impl;

import com.nface.manage.common.utils.StringUtils;
import com.nface.manage.login.dao.UserDAO;
import com.nface.manage.login.dto.UserDTO;
import com.nface.manage.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {
    private static final String LOGIN_SUCCESS = "success";
    private static final String LOGIN_FAIL = "fail";

    @Autowired
    UserDAO userDAO;

    public boolean register(UserDTO user) {
        userDAO.register(user);
        return true;
    }

    public Map<String, Object> login(HttpServletRequest request) {
        Object userName = request.getParameter("userName");
        Object password = request.getParameter("userPassword");
        Map<String, Object> result = new HashMap<String, Object>();

        if (null == userName || password == null || StringUtils.isEmpty(userName.toString()) || StringUtils.isEmpty(password.toString())) {
            result.put("resultCode", LOGIN_FAIL);
            result.put("msg", "请输入正确用户名与密码");
            return result;
        }
        Map<String, String> para = new HashMap<String, String>(1);
        para.put("userName", userName.toString());
        para.put("userPassword", password.toString());
        int count = userDAO.countUser(para);
        if (count > 0) {
            result.put("resultCode", LOGIN_SUCCESS);
        } else {
            result.put("resultCode", LOGIN_FAIL);
            result.put("msg", "用户名或密码不正确");
        }
        return result;
    }


    public boolean removeUser(String userName) {
        userDAO.removeUser(userName);
        return true;
    }
}
