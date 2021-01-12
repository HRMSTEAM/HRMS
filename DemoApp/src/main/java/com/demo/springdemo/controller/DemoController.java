package com.demo.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.springdemo.entity.Branch;
import com.demo.springdemo.entity.Company;
import com.demo.springdemo.entity.Department;
import com.demo.springdemo.entity.User;
import com.demo.springdemo.service.BranchService;
import com.demo.springdemo.service.CompanyService;

@Controller
public class DemoController {
	
	@Autowired
	CompanyService companyService;
	
	@Autowired
	BranchService branchService;

	@RequestMapping("homePage")
	public String showHOmePage(Model model, User user) {
		
		model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping("company/ShowCompanyMasterForm")
	public String showCompanyMasterForm(Model model, Company company) {
		
		model.addAttribute("company", company);
				
		return "company-master";
	}
	
	@RequestMapping("branch/ShowBranchMasterForm")
	public String showBranchMasterForm(Model model, Branch branch) {
		
		model.addAttribute("branch", branch);
		
		List<Company> theCompany = companyService.getCompany();
		model.addAttribute("availableCompany",theCompany);
				
		return "branch-master";
	}
	
	@RequestMapping("department/ShowDepartmentMasterForm")
	public String showDepartmentMasterForm(Model model, Department department) {
		
		model.addAttribute("department", department);
		
		List<Company> theCompany = companyService.getCompany();
		model.addAttribute("companyList",theCompany);
		
		List<Branch> theBranch = branchService.getBranches();
		model.addAttribute("branchList",theBranch);
				
		return "department-master";
	}
	
	
	@RequestMapping("user/ShowSignUpForm")
	public String showSignUpForm(Model model) {
		
		model.addAttribute("user", new User());
		return "sign-up-form";
	}
	
	@RequestMapping("user/ShowLoginForm")
	public String showLoginForm(Model model, User user) {
		
		model.addAttribute("user", user);
		return "login-form";
	}
}
