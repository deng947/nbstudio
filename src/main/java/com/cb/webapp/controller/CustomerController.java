package com.cb.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cb.service.CustomerInformationManager;

@Controller
public class CustomerController {
	@Autowired
	CustomerInformationManager customerInformationManager;

	@RequestMapping("/customers*")
	public String execute(ModelMap model) {
		model.addAttribute("customerInformationsList",
				customerInformationManager.getCustomerInformations());
		return "crm/customer/customerList";
	}
}
