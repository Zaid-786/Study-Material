package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.module.Admin;
 

public interface  AdminRepository extends JpaRepository< Admin, Integer> {
	
 
}