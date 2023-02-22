package com.example.demo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.Employee.Employee;


@RestController
public class HelloController{
	
	@Autowired
	EmployeeRepository emp
	
	@GetMapping ("/sayHello")
	public String sayHello() {
		return "DAMN!! It works now...";
	}

	@GetMapping ("/Hello")
	public String sayHi(@RequestParam String name) {
		return "Hello " + name;
	}

	// Open like:
	// http://localhost:8080/login?userid=101&password=Kunal
	@RequestMapping("/login")
	public String login(@RequestParam String userid,@RequestParam String password) {
		if(userid.equals("101")&&password.equals("Kunal")) {
			return "Welcome Kunal";
		}
		return "Invalid  User";
	}

	// HTTPS MODES PUT POST GET DELETE
	@GetMapping("/getEmployee")
	public Employee getEmployee() {
		Employee emp = new Employee(101, "Kunal", 22, 25000, "Fullstack Developer");
		System.out.print("chlra hai??");
		return emp;
	}

	@PostMapping("/insertData")
	public String inserData(@RequestBody Employee empobj) {
		System.out.println("Record entered of : "+empobj);
		return "Record Entered Successfully";
	}

	@PutMapping("/updateData")
	public String updateData(@RequestBody Employee empobj) {
		System.out.println("Record updated  of : "+empobj);
		return "Record Entered Successfully";
	}

	// http://localhost:8080/deleteData/12
	@DeleteMapping(path="/deleteData/{id}")
	public String deleteData(@PathVariable int id) {
		System.out.println("Employee record deleted with given id "+id);
		return "Deleted Sucessfully ";
	}
}