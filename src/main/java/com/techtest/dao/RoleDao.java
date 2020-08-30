package com.techtest.dao;

import com.techtest.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
