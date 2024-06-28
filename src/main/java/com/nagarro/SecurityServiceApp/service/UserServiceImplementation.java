package com.nagarro.SecurityServiceApp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.SecurityServiceApp.model.Role;
import com.nagarro.SecurityServiceApp.model.User;
import com.nagarro.SecurityServiceApp.repo.RoleRepo;
import com.nagarro.SecurityServiceApp.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service  @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImplementation implements UserService {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private RoleRepo roleRepo;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
//		log.info("Saving new user {} to the database",user.getName());
		return userRepo.save(user);
	}

	@Override
	public Role saveRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepo.save(role);
	}

	@Override
	public void addRoleToUser(String username, String rolename) {
		// TODO Auto-generated method stub
		User user=userRepo.findByUsername(username);
		Role role=roleRepo.findByName(rolename);
		user.getRoles().add(role);
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return userRepo.findByUsername(username);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}
