package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.CartItem;

public interface CartitemRepo extends JpaRepository<CartItem, Integer> {

}
