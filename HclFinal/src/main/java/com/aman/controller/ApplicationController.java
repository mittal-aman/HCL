package com.aman.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aman.module.User;
import com.aman.services.QuestionService;
import com.aman.services.UserService;

@Controller
public class ApplicationController 
{	
	@Autowired
	private UserService userService;
	private QuestionService questionService;
	
	@RequestMapping("/welcome")
	public String HomePage(HttpServletRequest request) {
		request.setAttribute("mode","MODE_HOME");
		return "welcome";
	}
	
	@RequestMapping("/register")
	public String registration(HttpServletRequest request) {
		request.setAttribute("mode","MODE_REGISTER");
		return "welcome";
	}
	
	@PostMapping("/save-user")
	public String registerUser(@ModelAttribute User user,BindingResult bindingResult,HttpServletRequest request) {
		userService.saveMyUser(user);
		//request.setAttribute("users", userService.showAllUsers());
		request.setAttribute("mode", "MODE_HOME");
		return "welcome";
	}
	
	@GetMapping("/show-users")
	public String showAllUsers(HttpServletRequest request) {
		request.setAttribute("users", userService.showAllUsers());
		request.setAttribute("mode", "ALL_USERS");
		return "welcome";
	}
	
	@GetMapping("/delete-user")
	public String deleteUser(@RequestParam int id , HttpServletRequest request ) {
		userService.deleteMyUser(id);
		request.setAttribute("users", userService.showAllUsers());
		request.setAttribute("mode", "ALL_USERS");
		return "welcome";
	}
	
	@GetMapping("/edit-user")
	public String editUser(@RequestParam int id , HttpServletRequest request ) {
		User user = userService.editMyUser(id).get();
		request.setAttribute("user", user);
		request.setAttribute("mode", "MODE_UPDATE");
		return "welcome";
	}
	
	@GetMapping("/login")
	public String login(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_LOGIN");
		return "welcome";
	}
	
	@RequestMapping ("/question")
	public String loginUser(@ModelAttribute User user, HttpServletRequest request) 
	{
		if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword())!=null) 
		{
			return "homepage";
		}
		else {
			request.setAttribute("error", "Invalid Username or Password");
			request.setAttribute("mode", "MODE_LOGIN");
			return "welcome";
			
		}
	}
	
	@GetMapping("/add-question")
	public String addquestion(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_AddQuestion");
		return "add-question";
	}
	
}
