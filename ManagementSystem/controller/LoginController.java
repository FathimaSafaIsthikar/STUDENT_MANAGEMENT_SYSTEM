package com.example.ManagementSystem.controller;


import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.ManagementSystem.entity.Login;
import com.example.ManagementSystem.service.Loginservice;

@Controller
public class LoginController {
	

	@Autowired
    private Loginservice userService;

                                   
    @GetMapping("/login")		//request for login
           
    public ModelAndView login() {
    	ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Login());
        return mav;
    }

    @PostMapping("/login")		//Check if user login is correct
    public String login(@ModelAttribute("user") Login user ) {
    	
    	Login oauthUser = userService.login(user.getUsername(), user.getPassword());
    	

    	System.out.print(oauthUser);
    	if(Objects.nonNull(oauthUser)) 
    	{	
  
    		return "redirect:/homes";
    	
    		
    	} else {
    		return "redirect:/login";
    		
    	
    	}

}
    
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
    	
	  
        return "redirect:/login";
    }

}