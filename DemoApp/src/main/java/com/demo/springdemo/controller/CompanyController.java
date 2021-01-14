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

import com.demo.springdemo.entity.Company;
import com.demo.springdemo.service.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/saveCompany")
	public String saveBranch(@ModelAttribute("company") Company company, @RequestParam("action") String action, Model model) {
	
		if(action.equals("Save")) {
			companyService.saveCompany(company);
			model.addAttribute("company", company);
		    model.addAttribute("successMsg", 	"Company Registered Successfully");
			return "company-master";
		} else if(action.equals("Clear")) {
			return "redirect:ShowCompanyMasterForm";
		} else if(action.equals("Close")) {
			return "redirect:list";
		}else {
			return "redirect:ShowCompanyMasterForm";
		}
		
		
	}

	@GetMapping("/list")
	public String listCompany(Model model) {
		
		List<Company> theCompany = companyService.getCompany();
		model.addAttribute("company", theCompany);
		return "company-details";
	}
	
	@GetMapping("/showFormForUpdate")
	public String getCompany(@RequestParam("companyId") String companyId, Model model) {

		Company company = companyService.getCompany(companyId);
		model.addAttribute("company", company);
		return "company-master";
	}
	
	@GetMapping("/deleteCompany")
	public String deleteBranch(@RequestParam("companyId") String companyId, Model model) {

		companyService.deleteCompany(companyId);

		return "redirect:/company/list";

	}

}
