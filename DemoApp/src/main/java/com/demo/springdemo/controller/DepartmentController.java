package com.demo.springdemo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.springdemo.entity.Department;
import com.demo.springdemo.entity.Branch;
import com.demo.springdemo.entity.Company;
import com.demo.springdemo.service.DepartmentService;
import com.demo.springdemo.service.BranchService;
import com.demo.springdemo.service.CompanyService;

@Controller
@SessionAttributes("user")
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	BranchService branchService;
	
	@Autowired
	private CompanyService companyService;

	@PostMapping("/saveDepartment")
	public String saveDepartment(@ModelAttribute("department") Department department, Model model) {
	
		departmentService.saveDepartment(department);

		model.addAttribute("department", department);	
		
		List<Company> theCompany = companyService.getCompany();
		model.addAttribute("companyList",theCompany);
		
		List<Branch> theBranch = branchService.getBranches();
		model.addAttribute("branchList",theBranch);
		
		return "department-master";
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
	public String listDepartment(Model model) {

		List<Department> theDepartment = departmentService.getDepartmentes();

		model.addAttribute("users", theDepartment);

		return "user-list";

	}

	@GetMapping("/showFormForUpdate")
	public String getDepartment(@RequestParam("userId") String userId, Model model) {

		Department user = departmentService.getDepartment(userId);

		model.addAttribute("user", user);

		return "sign-up-form";

	}

	@GetMapping("/deleteDepartment")
	public String deleteDepartment(@RequestParam("userId") String userId, Model model) {

		departmentService.deleteDepartment(userId);

		return "redirect:/user/list";

	}*/


}
