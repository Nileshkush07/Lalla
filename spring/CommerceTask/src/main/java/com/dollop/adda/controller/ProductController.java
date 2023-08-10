package com.dollop.adda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.adda.bean.Product;
import com.dollop.adda.service.Productservice;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private Productservice ps;
	
	
	@PostMapping("/prodsave")
	public ResponseEntity<Product> addProduct(@RequestBody Product product)
	{
		Product prd = this.ps.addProduct(product);
		  
		
		return new ResponseEntity<Product>(prd, HttpStatus.CREATED);
	}

@GetMapping("/fetchallproduct")
	public ResponseEntity<List<Product>> getallProduct(){
		ResponseEntity<List<Product>> response=new ResponseEntity<List<Product>>(this.ps.getallProduct(),HttpStatus.OK);
		return response;
	}

@PostMapping("/updateprod/{id}")
public ResponseEntity<Product> updateProduct(@PathVariable("id") Product product){
	ResponseEntity<Product> response=new ResponseEntity<Product>(this.ps.updateProduct(product),HttpStatus.OK);
	return response;
}

@GetMapping("/getprodbyid/{id}")
public ResponseEntity<Product> getProduct(@PathVariable("id") Integer id){
	ResponseEntity<Product> response=new ResponseEntity<Product>(this.ps.getProduct(id),HttpStatus.OK);
	return response;
}

}
