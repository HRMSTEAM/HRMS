package com.demo.springdemo.controller;

import java.util.ArrayList;
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
	
		System.out.println("branch: "+branch);
				
		branchService.saveBranch(branch);

		model.addAttribute("branch", branch);	
		
		List<Company> theCompany = companyService.getCompany();
		model.addAttribute("availableCompany",theCompany);
		
		System.out.println("sssssss: "+new Branch());

		return "branch-master";
	}
	/*@ModelAttribute("availableCompany")
	   public List<String> getNumbersList() {
	      List<String> numbersList = new ArrayList<String>();
	      numbersList.add("Infosys123");
	      numbersList.add("Capgemini");
	      numbersList.add("SS");
	      numbersList.add("C00001");
	      return numbersList;
	      
	      

	   }*/

	/*@GetMapping("/list")
	public String listBranch(Model model) {

		List<Branch> theBranch = branchService.getBranches();

		model.addAttribute("users", theBranch);

		return "user-list";

	}

	@GetMapping("/showFormForUpdate")
	public String getBranch(@RequestParam("userId") String userId, Model model) {

		Branch user = branchService.getBranch(userId);

		model.addAttribute("user", user);

		return "sign-up-form";

	}

	@GetMapping("/deleteBranch")
	public String deleteBranch(@RequestParam("userId") String userId, Model model) {

		branchService.deleteBranch(userId);

		return "redirect:/user/list";

	}*/


}
