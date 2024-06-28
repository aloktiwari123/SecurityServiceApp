package com.nagarro.SecurityServiceApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.SecurityServiceApp.model.User;

public interface UserRepo extends JpaRepository<User,Long> {
	
	User findByUsername(String username);

}
