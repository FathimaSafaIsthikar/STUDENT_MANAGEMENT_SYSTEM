package com.example.ManagementSystem.entity;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="firstName",nullable=false)
	private String fName;
	
	@Column(name="lastName")
	private String lName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="coursename")
	private String coursename;
	
	public Student() {
		
	}
	
	public Student(String fName, String lName, String email,String coursename) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.coursename = coursename;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	
	
}
