package com.demo.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.demo.springdemo.entity.User;

@Controller
public class DemoController {

	@RequestMapping("/")
	public String showLoginPage(Model model, User user) {
		
		return "redirect:ShowLoginForm";
	}	
	
	@RequestMapping("homePage")
	public String showHomePage(Model model, User user) {
		
		model.addAttribute("user", user);
		return "index";
	}	
	
	@RequestMapping("ShowSignUpForm")
	public String showSignUpForm(Model model) {
		
		model.addAttribute("user", new User());
		return "sign-up-form";
	}
	
	
	
	@RequestMapping("ShowLoginForm")
	public String showLoginForm(Model model, User user) {
		
		model.addAttribute("user", user);
		return "login-form";
	}
}
