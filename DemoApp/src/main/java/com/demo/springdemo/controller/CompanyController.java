package com.demo.springdemo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.demo.springdemo.entity.Company;
import com.demo.springdemo.service.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@GetMapping("/list")
	public String listCompany(Model model) {
		List<Company> theCompany = companyService.getCompany();
		model.addAttribute("company", theCompany);
		return "user-list";
	}
	@GetMapping("/showFormForUpdate")
	public String getCompany(@RequestParam("companyId") String companyId, Model model) {

		Company company = companyService.getCompany(companyId);
		model.addAttribute("company", company);
		return "sign-up-form";
	}

}
