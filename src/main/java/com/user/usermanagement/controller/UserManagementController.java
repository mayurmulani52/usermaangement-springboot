package com.user.usermanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserManagementController {
	
	
	 @GetMapping("/welcome")
	    public String home() {
	        return "Hello, Welcome to User Management Console!";
	    }


}
