package com.service;

import java.util.List;


import com.entity.Role;

public interface RoleService {
	public Role saveOrUpdateRole(Role pRole);
	public void deleteRole(Long pId);
	public Role findRoleById(Long pId);
	public List<Role> findRoles();

}
