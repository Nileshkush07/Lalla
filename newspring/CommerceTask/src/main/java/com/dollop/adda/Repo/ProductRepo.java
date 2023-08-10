package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
