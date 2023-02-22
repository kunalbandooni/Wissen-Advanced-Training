package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Person.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{
	@Query(value = "select * from PERSON", nativeQuery = true)
	public List<Person> getAllEmployees();
}