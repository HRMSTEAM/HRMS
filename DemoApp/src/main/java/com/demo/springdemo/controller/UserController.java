package com.demo.springdemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.springdemo.entity.User;
import com.demo.springdemo.service.UserService;

@Controller
@SessionAttributes("user")
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/saveUser")
	public String saveUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
	
		if (bindingResult.hasErrors()) {

			return "sign-up-form";
		}/* else {
			List<User> userList = userService.getUsers();
			boolean m = false;
			for (int i = 0; i < userList.size(); i++) {
				String userId = userList.get(i).getUserId();

				if (userId.equals(user.getUserId())) {
					m = true;
				}
			}

			if (m) {
				return "sign-up-form";
			}*/

			else {
				System.out.println("user: "+user);
				userService.saveUser(user);

				model.addAttribute("user", new User());

				return "login-form";
			}
		//}
	}

	@GetMapping("/list")
	public String listUsers(Model model) {

		List<User> theUser = userService.getUsers();

		model.addAttribute("users", theUser);

		return "user-details";

	}

	@GetMapping("/showFormForUpdate")
	public String getUser(@RequestParam("userId") String userId, Model model) {

		User user = userService.getUser(userId);

		model.addAttribute("user", user);

		return "sign-up-form";

	}

	@GetMapping("/deleteUser")
	public String deleteUser(@RequestParam("userId") String userId, Model model) {

		userService.deleteUser(userId);

		return "redirect:/user/list";

	}

	@PostMapping("loginUser")
	public String loginUser(@RequestParam("userId") String userId,@RequestParam("userPassword") String password,Model model) {
		/*if (bindingResult.hasErrors()) {

			return "sign-up-form";
		}else {*/
			
		
		boolean validUser = userService.loginUser(userId, password);

		if (validUser) {
			System.out.println("index");
			
			User user = userService.getUser(userId);

			model.addAttribute("user", user);
			
			return "index";
			// return "redirect:/homePage";
		} else {
			System.out.println("loginform");
			model.addAttribute("user", new User());
			return "login-form";
		}
	//}

	}
	
	@ModelAttribute("user")
	 public User userInfo() {
	  return new User();
	 }
}
