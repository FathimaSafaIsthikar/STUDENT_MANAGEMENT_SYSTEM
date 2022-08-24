package com.example.ManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementSystem.entity.Student;

@Repository
public interface StudentsRepository extends JpaRepository<Student,Long> {

}
