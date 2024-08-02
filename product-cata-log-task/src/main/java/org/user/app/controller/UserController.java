package org.user.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.user.app.model.User;
import org.user.app.service.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserController(UserService userService)
	{
		this.userService=userService;
	}
	@GetMapping("/users")
	public String userList()
	{
		
		return "index";
	}
	@GetMapping("/userr")
	public String userList1(Model model)
	{
		model.addAttribute("userr",this.userService.getUsers());
		return "display";
	}
	@GetMapping("/user")
	public String showAddUserForm(Model model)
	{
		model.addAttribute("user",new User());
		return "add-user";
	}
	
	@PostMapping("/process")
	public String addUserProcess(@Valid User user,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "add-user";
		}
		this.userService.adduser(user);
		return "redirect:userr";
	}
	
}
