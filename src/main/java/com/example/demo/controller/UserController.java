package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/user")
public class UserController {

	
	public String home () {
		
		return "Welcome to HOME PAGE";
	}
	
public String dashboard () {
		
		return "Welcome to DASHBOARD PAGE";
	}
}
