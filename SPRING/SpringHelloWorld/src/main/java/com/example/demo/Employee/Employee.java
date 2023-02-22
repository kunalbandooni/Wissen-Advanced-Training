package com.example.demo.Employee;

public class Employee {
	public int id;
	public String name;
	public int age;
	public String designation;
	
	public Employee(int id, String name, int age, String designation) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.designation = designation;
	}
	
	public String toString() {
		String s = "ID : " + this.id;
		return s;
	}
	
}