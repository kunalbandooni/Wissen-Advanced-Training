package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Student.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	// GET ALL STUDENTS
	@Query(value="select * from student_details", nativeQuery=true)
	public List<Student> getAllStudents();

	// GET STUDENTS BY ID
	@Query(value="select * from student_details where id = ?1", nativeQuery=true)
	public Student getStudentById(int id);
}