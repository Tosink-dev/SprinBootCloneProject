package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/user")
public class UserController {

	@GetMapping("/home")
	public String home () {
		
		return "Welcome to HOME PAGE";
	}
	
	@PostMapping("/dashboard")
public String dashboard () {
		
		return "Welcome to DASHBOARD PAGE";
	}
}
