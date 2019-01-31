package com.nface.manage.login.action;

import com.nface.manage.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping(value = "loginAction")
public class LoginAction {
    @Autowired
    LoginService loginService;

    @RequestMapping("login")
    public String login(HttpServletRequest request) {

        Map<String, Object> login = loginService.login(request);
        Object resultCode = login.get("resultCode");
        if ("success".equals(resultCode)) {
            return "index";
        }
        return "/src/login/login.html";
    }


}
