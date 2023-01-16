package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.module.College;

 
public interface CollegeRepository extends JpaRepository<College, Integer> {
	
 
}