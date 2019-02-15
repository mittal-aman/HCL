//package com.aman.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.aman.module.User;
//import com.aman.services.UserService;
//
//@org.springframework.web.bind.annotation.RestController
//public class RestController 
//{
//	@Autowired
//	private UserService userService;
//	@GetMapping("/")
//	public String Hello() 
//	{
//		return "This is Home Page";
//	}
//	
//	@GetMapping("/saveuser")
//	public String saveUser(@RequestParam String username,@RequestParam String firstname,@RequestParam String lastname,@RequestParam String password) {
//		User user = new User(username,firstname,lastname,password);
//		userService.saveMyUser(user);
//		return "User Saved";
//	}
//}
