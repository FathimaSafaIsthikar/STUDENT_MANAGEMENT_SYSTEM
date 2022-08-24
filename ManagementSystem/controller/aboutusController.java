package com.example.ManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class aboutusController {
	
	@GetMapping("/aboutus")
	public String createCourseForm(Model model) {
		
		//create student object to hold student form data
		return "aboutus";
	}}
