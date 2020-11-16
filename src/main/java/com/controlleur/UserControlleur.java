package com.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.service.UserService;

@CrossOrigin(allowCredentials="true") //,origins ="http://localhost:4200"
@RestController
@RequestMapping(value = "/UserWebService")
public class UserControlleur {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value = "/user/{id}")
	public User findUserById(@PathVariable("id") Long pId) {
		return userService.findUserById(pId);
	};
	
	@PostMapping(value = "/user")
	public User saveOrUpdateUser(@RequestBody User pUser) {
		return userService.saveOrUpdateUser(pUser);
	};
	
	@DeleteMapping(value = "/user/{id}")
	public void deleteUser(@PathVariable("id") Long pId) {
		userService.deleteUser(pId);
	};
	
	@GetMapping(value = "/users")
	public List<User> findUsers(){
		return userService.findUsers();
	};
	
	
	
	
	
}
