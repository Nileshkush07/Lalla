package com.dollop.adda.crepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.cbean.Product;

public interface Productrepo extends JpaRepository<Product, Integer> {
	

}
