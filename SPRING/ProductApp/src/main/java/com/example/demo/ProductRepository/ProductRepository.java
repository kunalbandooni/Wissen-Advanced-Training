package com.example.demo.ProductRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Product.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	// GET ALL PRODUCTS
	@Query(value="select * from product_details", nativeQuery=true)
	public List<Product> getAllProducts();

	// GET PRODUCT BY ID
	@Query(value="select * from product_details where product_id = ?1", nativeQuery=true)
	public Product getProductById(int id);
	
	// DELETE AN EXSISTING PRODUCT - somehow, not working
	//@Query(value="delete from product_details where product_id = ?1", nativeQuery=true)
	//public void deleteById(int id);
	
	// GET A PRODUCT FROM MULTIPLE MANUFACTURERS AND RETURN THEM DISPLAY IN ORDER OF RATING
	@Query(value="select * from product_details where name = ?1 order by rating desc", nativeQuery=true)
	public List<Product> getProductFromAllManufacturers(String name);
}