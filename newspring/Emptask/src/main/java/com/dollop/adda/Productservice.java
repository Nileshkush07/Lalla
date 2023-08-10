package com.dollop.adda;

import org.springframework.stereotype.Service;

import com.dollop.adda.bean.Product;
import com.dollop.adda.exception.ProductNotfoundException;

@Service
public class Productservice {

	public Product getOneProductById(Integer id) {
		
		if(id==989)
			return new Product(id,"xxx");
		else
			throw new ProductNotfoundException("product nhi h "+id+"nahi h be");
		
	}
	
}
