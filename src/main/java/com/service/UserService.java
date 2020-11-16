package com.service;

import java.util.List;


import com.entity.User;

public interface UserService {
	public User saveOrUpdateUser(User pUser);
	public void deleteUser(Long pId);
	public User findUserById(Long pId);
	public List<User> findUsers();

}
