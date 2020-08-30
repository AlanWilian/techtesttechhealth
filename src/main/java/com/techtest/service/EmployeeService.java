package com.techtest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techtest.entity.Employee;

@Service
public interface EmployeeService {
	
public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

	public List<Employee> searchBy(String theName);
	
}
