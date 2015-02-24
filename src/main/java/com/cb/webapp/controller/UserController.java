package com.cb.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cb.service.CustomerInformationManager;
import com.cb.service.UserManager;

@Controller
public class UserController {
    @Autowired
    UserManager userManager;
    @Autowired
	CustomerInformationManager customerInformationManager;
    
    @RequestMapping("/users*")
    public String execute(ModelMap model) {
        model.addAttribute("userList", userManager.getUsers());
        return "userList";
    }
    
    @RequestMapping("/customers2*")
	public String executeddd(ModelMap model) {
		model.addAttribute("customerInformationsList",
				customerInformationManager.getCustomerInformations());
		model.addAttribute("userList", userManager.getUsers());
		return "/crm/customer/customerList";
		// return "userList.jsp";
	}
}
