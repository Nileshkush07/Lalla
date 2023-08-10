package com.dollop.adda.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.ProductRepo;
import com.dollop.adda.bean.Product;
import com.dollop.adda.exception.ProductNotFoundException;
import com.dollop.adda.service.Productservice;
@Service
public class Productimpl implements Productservice {

	@Autowired
	private ProductRepo pr;
	
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return this.pr.save(product);
	}

	@Override
	public List<Product> getallProduct() {
		// TODO Auto-generated method stub
		return this.pr.findAll();
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return this.pr.save(product);
	}

	@Override
	public Product getProduct(Integer Id) {
		// TODO Auto-generated method stub
		return this.pr.getById(Id);
	}

	@Override
	public Product getOneProductById(Integer id) {
		// TODO Auto-generated method stub
		
			
			if(id==1)
				return new Product();
			else
				throw new ProductNotFoundException("product nhi h "+id+"nahi h be");
			
		
	}


}
