package com.example.demo.User;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table(name="user_details")
public class User {
	
	@Id
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	// Constructors
	public User() {	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	// Get Methods
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	// Set Methods
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}