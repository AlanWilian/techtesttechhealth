package com.techtest.dao;

import java.util.List;

import com.techtest.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
    public List<User> findAll(); 
    
}
