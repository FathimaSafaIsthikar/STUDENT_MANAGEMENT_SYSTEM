package com.example.ManagementSystem.controller;


import java.util.List;

import org.springframework.data.domain.Page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ManagementSystem.entity.Course;
import com.example.ManagementSystem.service.CourseService;



@Controller
public class CourseController {

	private CourseService courseService;

	public CourseController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}
	
	//handle method to handle list students and return mode and view
	@GetMapping("/courses")
	public String listCourses(Model model) {
		//model.addAttribute("courses",courseService.getAllCourse());
		
		return findPaginated(1,model);

	}
	
@GetMapping("/courses/new")
	public String createCourseForm(Model model) {
		
		//create student object to hold student form data
		Course course =new Course();
		model.addAttribute("course",course);
		return "create_course";
	}
	
	@PostMapping("/courses")
	public String saveCourse(@ModelAttribute("course") Course course) {
		
		courseService.saveCourse(course);
		return "redirect:/courses";
	}
	
	@GetMapping("/courses/edit/{id}")
	public String editCourseForm(@PathVariable Long id, Model model) {
		model.addAttribute("course",courseService.getCourseById(id));
		return "edit_course";
	}
	
	@PostMapping("/courses/{id}")
	public String updateCourse(@PathVariable Long id,
		@ModelAttribute("course") Course course,
		Model model){
		
		//get student from database by id
		Course existingCourse=courseService.getCourseById(id);
		existingCourse.setId(id);
		existingCourse.setId(course.getId());
		existingCourse.setDuration(course.getDuration());
		
		//save updated student object
		courseService.updateCourse(existingCourse);
		return "redirect:/courses";
	}
	
	//handler method to handle delete student request
	@GetMapping("/courses/{id}")
	public String deleteCourse(@PathVariable Long id) {
		courseService.deleteCourseById(id);
		return "redirect:/courses";
	}

	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable (value="pageNo") int pageNo, Model model) {
		
		int pageSize = 5;
		
		Page<Course> page =courseService.findPaginated(pageNo, pageSize);
		List<Course> listCourse = page.getContent(); //retrieved list of Paginated Courses
		
		model.addAttribute("currentPage", pageNo); //passing pageno to thymeleaf template 
		model.addAttribute("totalPages", page.getTotalPages());//""
		model.addAttribute("totalItems", page.getTotalElements());//""
		model.addAttribute("courses", listCourse);//""
		
		return "courses";
		
	}
	
//	@GetMapping("/courses")
//	public String getCourses(Model model,@Param("keyword") String keyword) {
//		List<Course> course = courseService.findAllCourse(keyword);
//		model.addAttribute("courses",course);
//		model.addAttribute("keyword",keyword);
//		return "courses";
//	}
//	
	

	
}

