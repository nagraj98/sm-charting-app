package com.casestudy.nagraj.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.nagraj.user.service.UserService;
import com.casestudy.nagraj.user.shared.UserRequest;
import com.casestudy.nagraj.user.shared.UserResponse;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users/get-user/{uname}&{password}")
	public UserResponse getUser(@PathVariable String uname, @PathVariable String password) throws Exception
	{
		return userService.getUser(uname,password);
	}
	
	@PostMapping("/users/add-user")
	public UserResponse addUser(@RequestBody UserRequest userDetails)
	{
		return userService.addUser(userDetails);
	}
}
