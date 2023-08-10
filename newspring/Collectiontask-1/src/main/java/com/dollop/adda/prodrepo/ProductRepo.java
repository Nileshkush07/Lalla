package com.dollop.adda.prodrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean1.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
