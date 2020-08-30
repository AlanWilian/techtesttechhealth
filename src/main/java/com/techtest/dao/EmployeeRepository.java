package com.techtest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtest.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	public List<Employee> findAllByOrderByNameAsc();
	
	public List<Employee> findByNameContainsOrNameContainsAllIgnoreCase(String name, String lName);

}
