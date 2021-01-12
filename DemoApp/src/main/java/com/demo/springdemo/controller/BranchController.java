package com.demo.springdemo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.springdemo.entity.Branch;
import com.demo.springdemo.entity.Company;
import com.demo.springdemo.service.BranchService;
import com.demo.springdemo.service.CompanyService;

@Controller
@RequestMapping("/branch")
public class BranchController {

	@Autowired
	private BranchService branchService;
	
	@Autowired
	private CompanyService companyService;

	@PostMapping("/saveBranch")
	public String saveBranch(@ModelAttribute("branch") Branch branch, Model model) {
	
		branchService.saveBranch(branch);

		model.addAttribute("branch", branch);	
		
		List<Company> theCompany = companyService.getCompany();
		model.addAttribute("availableCompany",theCompany);
		
		return "branch-master";
	}
	@GetMapping("/list")
	public String listBranch(Model model) {

		List<Branch> theBranch = branchService.getBranches();

		model.addAttribute("branch", theBranch);

		return "branch-details";

	}
	
	@GetMapping("/showFormForUpdate")
	public String getBranch(@RequestParam("branchId") String branchId, Model model) {

		Branch branch = branchService.getBranch(branchId);

		model.addAttribute("branch", branch);
		
		List<Company> theCompany = companyService.getCompany();
		model.addAttribute("availableCompany",theCompany);

		return "branch-master";

	}

	@GetMapping("/deleteBranch")
	public String deleteBranch(@RequestParam("branchId") String branchId, Model model) {

		branchService.deleteBranch(branchId);

		return "redirect:/branch/list";

	}


}
