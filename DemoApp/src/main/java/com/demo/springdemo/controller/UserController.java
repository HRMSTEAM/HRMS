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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.springdemo.entity.Branch;
import com.demo.springdemo.entity.Company;
import com.demo.springdemo.entity.Department;
import com.demo.springdemo.entity.User;
import com.demo.springdemo.service.BranchService;
import com.demo.springdemo.service.CompanyService;
import com.demo.springdemo.service.DepartmentService;
import com.demo.springdemo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	CompanyService companyService;
	
	@Autowired
	BranchService branchService;
	
	@Autowired
	DepartmentService departmentService;

	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user, @RequestParam("action") String action, Model model) {
			
		if(action.equals("Save")) {
			userService.saveUser(user);
	
			model.addAttribute("user", user);
			
			List<Company> theCompany = companyService.getCompany();
			model.addAttribute("companyList",theCompany);
			
			List<Branch> theBranch = branchService.getBranches();
			model.addAttribute("branchList",theBranch);
					
			List<Department> theDepartment = departmentService.getDepartments();
			model.addAttribute("departmentList",theDepartment);
		
			model.addAttribute("successMsg", 	"User Registered Successfully");
			return "user-master";
		} 
		else if(action.equals("Clear")) {
			return "redirect:ShowUserMasterForm";
		} 
		else if(action.equals("Close")) {
			return "redirect:details";
		}
		else {
			return "redirect:ShowUserMasterForm";
		}
	}
	
	@GetMapping("/showFormForUpdate")
	public String getUser(@RequestParam("userId") String userId, Model model) {

		User user = userService.getUser(userId);

		model.addAttribute("user", user);
		
		List<Company> theCompany = companyService.getCompany();
		model.addAttribute("companyList",theCompany);
		
		List<Branch> theBranch = branchService.getBranches();
		model.addAttribute("branchList",theBranch);
				
		List<Department> theDepartment = departmentService.getDepartments();
		model.addAttribute("departmentList",theDepartment);

		return "user-master";

	}
	
	@RequestMapping("/ShowUserMasterForm")
	public String showUserMasterForm(Model model, User user) {
		
		model.addAttribute("user", user);
		
		List<Company> theCompany = companyService.getCompany();
		model.addAttribute("companyList",theCompany);
		
		List<Branch> theBranch = branchService.getBranches();
		model.addAttribute("branchList",theBranch);
				
		List<Department> theDepartment = departmentService.getDepartments();
		model.addAttribute("departmentList",theDepartment);
				
		return "user-master";
	}
	
	@GetMapping("/details")
	public String listUsers(Model model) {

		List<User> theUser = userService.getUsers();

		model.addAttribute("user", theUser);

		return "user-details";

	}

	@GetMapping("/deleteUser")
	public String deleteUser(@RequestParam("userId") String userId, Model model) {

		userService.deleteUser(userId);

		return "redirect:/user/details";

	}
	
	@PostMapping("userLogin")
	public String loginUser(@RequestParam("userId") String userId,@RequestParam("userPassword") String password,Model model,final RedirectAttributes redirectAttributes) {
		
		boolean validUser = userService.loginUser(userId, password);
		
		System.out.println("validUser: "+validUser);

		if (validUser) {
			User user = userService.getUser(userId);
			model.addAttribute("user", user);			
			return "redirect:/homePage";
			
		} else {
		    redirectAttributes.addFlashAttribute("failMsg", "User Id or password is incorrect");
		    return "redirect:/ShowLoginForm";
		}
	}
	
	@RequestMapping("validateUserId")
	public @ResponseBody String validateUserId(@RequestParam("userId")String userId) {
	User user=	userService.getUser(userId);
	String msg="";
	if(user!=null) {
		msg=userId+" already exists";		
	}
		return msg;		
	}
}
