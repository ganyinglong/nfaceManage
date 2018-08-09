package com.nface.manage.login.action;

import com.nface.manage.base.BaseAction;
import com.nface.manage.login.dao.UserDAO;
import com.nface.manage.login.dto.Usr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "login")
public class LoginAction extends BaseAction {
    @Autowired
    UserDAO userDAO;

    @RequestMapping(value = "query")
    public List<Usr> querUserList(){
        System.out.println("进来了");
        return userDAO.querUserList();
    }
}
