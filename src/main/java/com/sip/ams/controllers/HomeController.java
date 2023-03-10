package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	//@ResponseBody
	public String home() {
		return "front/index.html";
	}
	public String login() {
		return "";

	}
	public String registration() {
		return "";
	}
	@RequestMapping("/contact")
	//@ResponseBody
	public String contact() {
		return "front/contact.html";
	}
}
