package com.example.demo.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table(name="student_details")
public class Student {
	
	@Id
	@Column(name="id")
	private int studentId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="standard")
	private int standard;
	
	@Column(name="date_of_birth")
	String dateOfBirth;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	// Constructors
	public Student() {	}
	
	public Student(int id, String name, int standard, String dob, String bloodGroup) {
		this.studentId = id;
		this.name = name;
		this.standard = standard;
		this.dateOfBirth = dob;
		this.bloodGroup = bloodGroup;
	}
	
	
	// Get methods
	public int getId() {
		return this.studentId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getStandard() {
		return this.standard;
	}
	
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	
	public String getBloodGroup() {
		return this.bloodGroup;
	}
	
	// Set Methods
	public void setId(int id) {
		this.studentId = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStandard(int standard) {
		this.standard = standard;
	}
	
	public void setDateOfBirth(String dob) {
		this.dateOfBirth = dob;
	}
	
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
}
