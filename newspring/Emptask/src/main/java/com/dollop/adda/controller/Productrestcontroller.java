package com.dollop.adda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.adda.Productservice;
import com.dollop.adda.bean.Product;
import com.dollop.adda.exception.ProductNotfoundException;

@RestController
@RequestMapping("/Product")
public class Productrestcontroller {
@Autowired
	private Productservice ps;
	
	/*
	 * @GetMapping("/get{id}") public ResponseEntity<String>
	 * getProductById(@PathVariable("id") Integer id){
	 * 
	 * if(id==123) return new ResponseEntity<>("product exit",HttpStatus.OK); else
	 * throw new ProductNotfoundException("product not found" +id);
	 * 
	 * }
	 */
	
	
	 @GetMapping("/get{id}")
	 public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id){
	 
ResponseEntity<Product> response=null;
try {
	 Product pb=ps.getOneProductById(id);
	 response =new ResponseEntity<Product>(pb,HttpStatus.OK);
	 }
catch(ProductNotfoundException pnfe) {
	pnfe.printStackTrace();
	throw pnfe;
}
return response;
}
	
	
}
