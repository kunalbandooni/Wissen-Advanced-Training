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

import com.example.demo.Employee.Employee;
import com.example.demo.repository.*;

@RestController
public class HelloController{

	@Autowired
	IEmployeeRepository empRepository;
	
	@GetMapping ("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		List<Employee> empLst = empRepository.getAllEmployees();
		// empRepository.finAll() does the same work
		return empLst;
	}

	@PostMapping ("/insertEmployee")
	public String insertEmployee(@RequestBody Employee empObj) {
		System.out.println("Recieved Data : " + empObj);
		empRepository.save(empObj);
		return "Record inserted successfully";
	}
	
	@PutMapping ("/updateEmployee")
	public String updateEmployee(@RequestBody Employee empObj) {
		Optional<Employee> empOptional = empRepository.findById(empObj.getId());
		
		if(empOptional.isPresent()) {
			
			Employee objToUpdate = empOptional.get();
			objToUpdate.setId(empObj.getId());
			objToUpdate.setName(empObj.getName());
			objToUpdate.setAge(empObj.getAge());
			objToUpdate.setSalary(empObj.getSalary());
			objToUpdate.setDesignation(empObj.getDesignation());
			empRepository.save(objToUpdate);
			
			return "Updated Record";
		}
		
		return "Unable to update record!";
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		System.out.println("Given id : " + id);
		
		empRepository.deleteById(id);
		
		return "Record Deleted Successfully";
	}
}