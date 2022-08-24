package com.example.ManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ManagementSystem.entity.Login;
import com.example.ManagementSystem.repository.LoginsRepository;





@Service
public class Loginservice {
	
	@Autowired
	private LoginsRepository repo;
  
  public Login login(String username, String password) {
	  Login user = repo.findByUsernameAndPassword(username, password);
  	return user;
  }
	

}