package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

}
