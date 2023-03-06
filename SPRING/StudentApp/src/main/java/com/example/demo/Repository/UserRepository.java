package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.User.User;

public interface UserRepository extends JpaRepository<User, String>{
	@Query(value="select * from user_details where username = ?1 and password = ?2", nativeQuery=true)
	public Optional<User> findById(String username, String Password);
}