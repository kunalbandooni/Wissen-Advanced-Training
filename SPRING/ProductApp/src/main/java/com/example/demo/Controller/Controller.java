package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Product.Product;
import com.example.demo.ProductRepository.ProductRepository;

@RestController
public class Controller {
	
	// Use this object to use methods of Repository
	@Autowired
	ProductRepository productObject;
	
	// GET ALL PRODUCTS
	@GetMapping(value="/all")
	public Object getAll() {
		List<Product> list = productObject.findAll(); //getAllProducts();
		for(Product p : list)
			System.out.print(p);
		return list;
	}
	
	// GET PRODUCT BY ID
	@GetMapping(value="/get/{id}")
	public Product getAllProducts(@PathVariable int id) {
		Product p = productObject.getProductById(id);
		return p;
	}
	
	// CREATE A NEW PRODUCT
	/*
	 * 
	 * {
    		"id" : 1,
    		"name" : "Gaming Mouse",
    		"description" : "Colour changing Mouse with upto 2400 dpi",
    		"manufacturer" : "Red Gear",
    		"rating" : 5,
    		"price" : 400
		}
	 * 
	 * 
	 * */
	
	// Do not let add same id
	@PostMapping(value="/add")
	public String addProduct(@RequestBody Product newProduct) {
		productObject.save(newProduct);
		return "Added";
	}
	
	// DELETE AN EXSISTING PRODUCT
	@DeleteMapping(value="/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		productObject.deleteById(id);
		return "DELETED";
	}
	
	// GET A PRODUCT FROM MULTIPLE MANUFACTURERS AND RETURN THEM DISPLAY IN ORDER OF RATING
	@GetMapping(value="/getFromProduct/{name}")
	public List<Product> getFromManufacturer(@PathVariable String name){
		List<Product> list = productObject.getProductFromAllManufacturers(name);
		return list;
	}
}