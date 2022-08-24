package com.example.ManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementSystem.entity.Login;

@Repository
public interface LoginsRepository extends JpaRepository<Login, Long>{
	Login findByUsernameAndPassword(String username, String password);

}
