package com.nagarro.SecurityServiceApp.service;

import java.util.List;

import com.nagarro.SecurityServiceApp.model.Role;
import com.nagarro.SecurityServiceApp.model.User;

public interface UserService {

	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String username, String rolename);
	User getUser(String username);
	List<User>getUsers();
}
