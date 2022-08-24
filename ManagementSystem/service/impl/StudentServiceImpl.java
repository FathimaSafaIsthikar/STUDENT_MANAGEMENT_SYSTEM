package com.example.ManagementSystem.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.ManagementSystem.entity.Student;
import com.example.ManagementSystem.repository.StudentsRepository;
import com.example.ManagementSystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	
	private StudentsRepository studentRepository; //constuctor based 
	
	public StudentServiceImpl(StudentsRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public  List<Student>getAllStudents(){
		return studentRepository.findAll(); //returns list of stds
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

//	@Override
//	public Page<Student> findPaginated(int pageNo, int pageSize) {
//		Pageable pageable =PageRequest.of(pageNo - 1, pageSize);
//		return this.studentRepository.findAll(pageable);
//		
//	}


	
	
}
