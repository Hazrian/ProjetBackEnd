package com.controlleur;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Role;
import com.service.RoleService;

@CrossOrigin(allowCredentials="true",origins ="http://localhost:4200")
@RestController
@RequestMapping(value = "/RoleWebService")
public class RoleControlleur {
	
	@Autowired
	RoleService roleService;
	
	@GetMapping(value = "/role/{id}")
	public Role findRoleById(@PathVariable("id") Long pId) {
		return roleService.findRoleById(pId);
	};
	
	@PostMapping(value = "/role")
	public Role saveOrUpdateRole(@RequestBody Role pRole) {
		return roleService.saveOrUpdateRole(pRole);
	};
	
	@DeleteMapping(value = "/role/{id}")
	public void deleteRole(@PathVariable("id") Long pId) {
		roleService.deleteRole(pId);
	};
	
	@GetMapping(value = "/roles")
	public List<Role> findRoles(){
		return roleService.findRoles();
	};
	
	
	
	
	
}
