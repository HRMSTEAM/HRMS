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
	public String saveDepartment(@ModelAttribute("department") Department department, @RequestParam("action") String action, Model model) {
	
		if(action.equals("Save")) {
			departmentService.saveDepartment(department);

			model.addAttribute("department", department);	
			
			List<Company> theCompany = companyService.getCompany();
			model.addAttribute("companyList",theCompany);
			
			List<Branch> theBranch = branchService.getBranches();
			model.addAttribute("branchList",theBranch);
		
			model.addAttribute("successMsg", 	"Department Registered Successfully");
		    return "department-master";
		} 
		else if(action.equals("Clear")) {
			return "redirect:ShowDepartmentMasterForm";
		} 
		else if(action.equals("Close")) {
			return "redirect:details";
		}
		else {
			return "redirect:ShowDepartmentMasterForm";
		}
	}

	@GetMapping("/showFormForUpdate")
	public String getDepartment(@RequestParam("departmentId") String departmentId, Model model) {

		Department department = departmentService.getDepartment(departmentId);
		
		model.addAttribute("department", department);
		
		List<Company> theCompany = companyService.getCompany();
		model.addAttribute("companyList",theCompany);
		
		List<Branch> theBranch = branchService.getBranches();
		model.addAttribute("branchList",theBranch);

		return "department-master";
	}
	
	@RequestMapping("/ShowDepartmentMasterForm")
	public String showDepartmentMasterForm(Model model, Department department) {
		
		model.addAttribute("department", department);
		
		List<Company> theCompany = companyService.getCompany();
		model.addAttribute("companyList",theCompany);
		
		List<Branch> theBranch = branchService.getBranches();
		model.addAttribute("branchList",theBranch);
				
		return "department-master";
	}
	
	@GetMapping("/details")
	public String listDepartment(Model model) {

		List<Department> theDepartment = departmentService.getDepartments();

		model.addAttribute("department", theDepartment);

		return "department-details";
	}

	@GetMapping("/deleteDepartment")
	public String deleteDepartment(@RequestParam("departmentId") String departmentId, Model model) {

		departmentService.deleteDepartment(departmentId);

		return "redirect:/department/details";
	}


}
