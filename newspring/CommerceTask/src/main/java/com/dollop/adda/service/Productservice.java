package com.dollop.adda.service;

import java.util.List;

import com.dollop.adda.bean.Product;


public interface Productservice {

	public Product addProduct(Product product);
	
    public List<Product> getallProduct();
	
	public Product  updateProduct(Product product);
	
	public  Product getProduct(Integer Id);
	
 public Product getOneProductById(Integer id);	
 

}
