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

import com.example.demo.Person.Person;
import com.example.demo.Repository.PersonRepository;

@RestController
public class Controller {
	
	@Autowired
	PersonRepository personRepo;
	
	@GetMapping ("/getAllPolicies")
	public List<Person> getAllPolicies(){
		List<Person> personList = personRepo.findAll();
		return personList;
	}
	
	@PostMapping ("/addNewPolicy")
	public String addNewPolicy(@RequestBody Person newPerson) {
		System.out.println("Recived Data : " + newPerson);
		personRepo.save(newPerson);
		return "Record Inserted Successfully! =D";
	}
	
	@PutMapping ("/updatePolicy")
	public String updatePolicy(@RequestBody Person newPerson) {
		Optional<Person> personOptional = personRepo.findById(newPerson.getPolicyId());
		
		if(personOptional.isPresent()) {
			Person toUpdate = personOptional.get();
			
			toUpdate.setPolicyId(newPerson.getPolicyId());
			toUpdate.setName(newPerson.getName());
			toUpdate.setPolicyAmount(newPerson.getPolicyAmount());
			toUpdate.setEmi(newPerson.getEmi());
			
			personRepo.save(toUpdate);
			
			return "Updated Record! =D";
		}
		
		return "No such Record found! :(";
	}
	
	@DeleteMapping("/removePolicy/{policyId}")
	public String deleteEmployee(@PathVariable int policyId) {
		System.out.println("Given id : " + policyId);
		personRepo.deleteById(policyId);
		return "Policy " + policyId + " Deleted!";
	}
	
	
	
}