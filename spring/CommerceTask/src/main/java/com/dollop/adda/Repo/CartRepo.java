package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {

}
