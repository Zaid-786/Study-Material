package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.module.User;

 
public interface UserRepository extends JpaRepository<User, Integer> {
	
 
}