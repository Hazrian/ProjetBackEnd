package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Role;
import com.repository.RoleRepository;
import com.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleRepository repo;

	@Override
	public Role saveOrUpdateRole(Role pRole) {
		return repo.save(pRole);
	}

	@Override
	public void deleteRole(Long pId) {
		repo.deleteById(pId);
	}

	@Override
	public List<Role> findRoles() {
		return repo.findAll();
	}

	@Override
	public Role findRoleById(Long pId) {
		return repo.findById(pId).get();
	}


	
	
}
