package com.example.demo.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_details")
public class Product {
	
	@Id
	@Column(name="product_id")
	private int productId;

	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="manufacturer")
	private String manufacturer;
	
	@Column(name="rating")
	private double rating;
	
	@Column(name="price")
	private double price;
	
	// CONSTRUCTORS
	
	public Product() {}
	
	public Product(int pId, String name, String description, String manufacturer, double rating, double price) {
		super();
		this.productId = pId;
		this.name = name;
		this.description = description;
		this.manufacturer = manufacturer;
		this.rating = rating;
		this.price = price;
	}
	
	public String toString() {
		return "\nid : " + this.productId;
	}
	
	// GET METHODS
	
	public int getProductId() {
		return this.productId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	public double getRating() {
		return this.rating;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	// SET METHODS
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}