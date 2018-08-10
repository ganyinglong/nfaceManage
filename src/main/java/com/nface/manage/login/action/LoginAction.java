package com.nface.manage.login.action;

import com.nface.manage.base.BaseAction;
import com.nface.manage.login.dto.UserDTO;
import com.nface.manage.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "loginAction")
public class LoginAction extends BaseAction {
    @Autowired
    LoginService loginService;

    @RequestMapping("register")
    public Boolean register(@RequestBody UserDTO user){
        return loginService.register(user);
    }


}
