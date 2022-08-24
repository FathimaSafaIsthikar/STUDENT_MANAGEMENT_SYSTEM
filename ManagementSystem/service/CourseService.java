package com.example.ManagementSystem.service;

import java.util.List;

import org.springframework.data.domain.Page;

import org.springframework.stereotype.Service;

import com.example.ManagementSystem.entity.Course;

@Service
public interface CourseService {

	List<Course>getAllCourse();
	 
	 Course saveCourse(Course course);
	 Course getCourseById(Long id);
	 Course updateCourse(Course course);
	 void  deleteCourseById(Long id);
	 
	 Page<Course> findPaginated(int pageNo,int pageSize); //implement method for pagination Page ,type Employee method findpaginated 
	 //and pass two parameters.
	 
//	 public List<Course> findAllCourse(String keyword);
	 
	 
}

