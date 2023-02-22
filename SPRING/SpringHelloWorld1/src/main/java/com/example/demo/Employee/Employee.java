package com.example.demo.Employee;

import javax.persistence.*;

@Entity
@Table("EMPLOYEE")
public class Employee extends JpaRepository{
	
	@Id
	public int id;
	
	@Column("NAME")
	public String name;
	
	@Column("AGE")
	public int age;
	
	@Column("SALARY")
	public int salary;
	
	@Column("DESIGNATION")
	public String designation;
	
	public Employee(){}
	
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
	
}