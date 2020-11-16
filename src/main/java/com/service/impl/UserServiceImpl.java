package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.repository.UserRepository;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository repo;

	@Override
	public User saveOrUpdateUser(User pUser) {
		return repo.save(pUser);
	}

	@Override
	public void deleteUser(Long pId) {
		repo.deleteById(pId);
	}

	@Override
	public List<User> findUsers() {
		return repo.findAll();
	}

	@Override
	public User findUserById(Long pId) {
		return repo.findById(pId).get();
	}


	
	
}
