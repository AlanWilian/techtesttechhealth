package com.techtest.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.techtest.entity.User;
import com.techtest.user.CrmUser;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
	
	public List<User> findAll(); 
}
