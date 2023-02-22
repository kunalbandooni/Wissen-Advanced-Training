package com.example.demo.Employee;

import jakarta.persistence.*;

@Entity
@Table(name="EMPLOYEE")
public class Employee{
	
	@Id
	@Column(name="EMP_ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="SALARY")
	private int salary;
	
	@Column(name="DESIGNATION")
	private String designation;
	
	public Employee(){	}
	
	public Employee(int id, String name, int age, int salary, String designation) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
	}
	
	public String toString() {
		String s = "ID : " + this.id;
		return s;
	}
	
	public int getId() {	
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDesignation() {
		return this.designation;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}