package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student.Student;
import com.example.demo.User.User;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Repository.UserRepository;

@RestController
public class Controller {
	
	// USER METHODS HERE...
	
	// Use this object to use methods of UserRepository
	@Autowired
	UserRepository userObject;
	
	// Method to add new User
	@PostMapping(value="/register")
	public String register(@RequestBody User newUser) {
		userObject.save(newUser);
		return "Added New User!! :D";
	}
	
	// Method to login with registered-user only
	@GetMapping(value="/login")
	public String login(@RequestBody User user) {
		Optional<User> userOptional = userObject.findById(user.getUsername(), user.getPassword());
		
		if(userOptional.isPresent())
			return "Welcome User!\nGood to see you back!! =D";
		else
			return "Not a valid user! :(";
	}
	
	
	// STUDENT METHODS HERE...
	
	// Use this object to use methods of StudentRepository
	@Autowired
	StudentRepository studentObject;
		
	// GET ALL STUDENTS
	@GetMapping(value="/viewAll")
	public Object getAllStudents() {
		List<Student> list = studentObject.getAllStudents();
		System.out.print("Student Details: ");
		for(Student p : list)
			System.out.print(p);
		return list;
	}
		
	// GET STUDENT BY ID
	@GetMapping(value="/view/{id}")
	public Student getStudentById(@PathVariable int id) {
		System.out.print("Student Detail with id as " + id + " : ");
		Student p = studentObject.getStudentById(id);
		return p;
	}
	
	// ADDING NEW STUDENT RECORDS
	@PostMapping(value="/add")
	public String addStudent(@RequestBody Student newStudent) {
		studentObject.save(newStudent);
		return "Added Student!! :D";
	}
	
	// UPDATING VALUES FOR EXSISTING STUDENT
	@PutMapping(value="/update")
	public String updateRecord(@RequestBody Student student) {
		Optional<Student> studentOptional = studentObject.findById(student.getId());
		
		if(studentOptional.isPresent()) {
			Student toUpdate = studentOptional.get();
			
			toUpdate.setName(student.getName());
			toUpdate.setStandard(student.getStandard());
			toUpdate.setDateOfBirth(student.getDateOfBirth());
			toUpdate.setBloodGroup(student.getBloodGroup());
			
			studentObject.save(toUpdate);
			
			return "Updated Record for student! =D";
		}
		
		return "No such student exsists found! :(";
	}
	
	// DELETE STUDENT WITH GIVEN ID
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		System.out.println("Given id : " + id);
		
		studentObject.deleteById(id);
		
		return "Record Deleted Successfully!! :D";
	}
}