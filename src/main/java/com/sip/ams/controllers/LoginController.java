package com.sip.ams.controllers;

import com.sip.ams.entities.User;
import com.sip.ams.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class LoginController {

	UserService userService;

	@Autowired
	public LoginController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/add")
	@ResponseBody
	public String addUser() {
		User user = new User();
		user.setEmail("haitham@gmail.com");
		user.setPassword("123456");
		user.setName("Haitham");
		user.setLastName("KSENTINI");
		this.userService.saveUser(user);
		return "Added";
	}
}
