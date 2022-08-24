package com.example.ManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ManagementSystem.entity.Course;

import antlr.collections.List;

@Repository
public interface CoursesRepository extends JpaRepository<Course,Long>{
	
	@Query(value="select s.id,s.first_name,s.last_name, c.course_name from students s Inner JOIN courses c ON s.course=c.id",nativeQuery=true)
	List findStudent();
	
	//@Query("SELECT courses FROM courses c WHERE CONCAT (c.course_name,'',c.duration) LIKE '%?1%' ")
	
//	public List search(String keyword);
//	
//	public Course findByCourseName(String course_name);
}