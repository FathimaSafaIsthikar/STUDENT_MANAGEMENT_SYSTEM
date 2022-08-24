package com.example.ManagementSystem.service.impl;


import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.ManagementSystem.entity.Course;
import com.example.ManagementSystem.service.CourseService;

import com.example.ManagementSystem.repository.CoursesRepository;

@Service
public class CourseServiceImpl implements CourseService{
	
	
	private CoursesRepository courseRepository;
	
	public CourseServiceImpl(CoursesRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}

	@Override
	public  List<Course>getAllCourse(){
		return courseRepository.findAll();
	}

	@Override
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public Course getCourseById(Long id) {
		return courseRepository.findById(id).get();
	}

	//
	@Override
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public void deleteCourseById(Long id) {
		courseRepository.deleteById(id);
		
	}

	@Override
	public Page<Course> findPaginated(int pageNo, int pageSize) {
		
		Pageable pageable =PageRequest.of(pageNo - 1, pageSize); //imple a method, pageable interface , pagerequest a class which
		//imple pageable...we strt with page number 1 base
		
		return this.courseRepository.findAll(pageable);
	}


	

//
//	@Override
//	public List<Course> findAllCourse(String keyword) {
//		if(keyword !=null) {
//			return (List<Course>) courseRepository.search(keyword);
//		}
//		return (List<Course>) courseRepository.findAll();
//	}
	}

	


