package com.example.ManagementSystem.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
	

	
	@GetMapping("/homes")
	public String home() {
		return "homes.html";
	}
	
	
}
