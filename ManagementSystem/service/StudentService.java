package com.example.ManagementSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.ManagementSystem.entity.Student;

@Service
public interface StudentService {
	 List<Student>getAllStudents(); //list the students
	 
	 Student saveStudent(Student student);
	 Student getStudentById(Long id);
	 Student updateStudent(Student student);
	 void  deleteStudentById(Long id);
	 
//	 Page<Student> findPaginated(int pageNo,int pageSize);
	 //implement method for pagination Page ,type Employee method findpaginated 
	 //and pass two parameters.
}
