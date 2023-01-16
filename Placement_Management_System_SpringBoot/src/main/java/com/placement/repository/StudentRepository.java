package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.module.Student;

 
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
 
}