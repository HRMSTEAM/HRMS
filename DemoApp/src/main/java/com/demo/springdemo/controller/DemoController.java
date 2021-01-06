package com.demo.springdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.springdemo.entity.Branch;
import com.demo.springdemo.entity.User;

@Controller
public class DemoController {

	@RequestMapping("homePage")
	public String showHOmePage(Model model, User user) {
		
		model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping("branch/ShowBranchMasterForm")
	public String showBranchMasterForm(Model model, Branch branch) {
		
		model.addAttribute("branch", branch);
		
		/*List<String> numbersList = new ArrayList<String>();
	      numbersList.add("Infosys");
	      numbersList.add("Capgemini");
	      numbersList.add("SS");
	      numbersList.add("AA");
	      
	      model.addAttribute("availableCompany",numbersList);
		*/
		return "branch-master";
	}
	
	@ModelAttribute("availableCompany")
	   public List<String> getNumbersList() {
	      List<String> numbersList = new ArrayList<String>();
	      numbersList.add("Infosys123");
	      numbersList.add("Capgemini");
	      numbersList.add("SS");
	      numbersList.add("C00001");
	      return numbersList;
	   }
	
	@RequestMapping("user/ShowSignUpForm")
	public String showSignUpForm(Model model, User user) {
		
		model.addAttribute("user", user);
		return "sign-up-form";
	}
	
	@RequestMapping("user/ShowLoginForm")
	public String showLoginForm(Model model, User user) {
		
		model.addAttribute("user", user);
		return "login-form";
	}
}
