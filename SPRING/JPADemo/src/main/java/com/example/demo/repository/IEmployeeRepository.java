package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Employee.*;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{
	@Query(value = "select * from EMPLOYEE", nativeQuery = true)
	public List<Employee> getAllEmployees();

	
}