package com.nface.manage.biz;

import com.nface.manage.base.BaseAction;
import com.nface.manage.biz.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("statistics")
public class StatisticsAction extends BaseAction {
    @Autowired
    CustomerDAO customerDAO;

    @RequestMapping("countCustomer")
    public long countCustomer(){
        return customerDAO.countCustomer();
    }
}
