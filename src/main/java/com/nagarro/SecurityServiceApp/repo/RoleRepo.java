package com.nagarro.SecurityServiceApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.SecurityServiceApp.model.Role;

public interface RoleRepo extends JpaRepository<Role,Long> {
	
	Role findByName(String name);

}
