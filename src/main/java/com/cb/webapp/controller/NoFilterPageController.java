package com.cb.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cb.service.CustomerInformationManager;
import com.cb.service.UserManager;

@Controller
public class NoFilterPageController {
    @Autowired
    UserManager userManager;
    @Autowired
	CustomerInformationManager customerInformationManager;
    
    @RequestMapping("/contact*")
    public String contactUs(ModelMap model) {
        //model.addAttribute("userList", userManager.getUsers());
        return "studio/contactUs";
    } 
    
    @RequestMapping("/about*")
    public String aboutUs(ModelMap model) {
        //model.addAttribute("userList", userManager.getUsers());
        return "studio/aboutUs";
    } 
}
