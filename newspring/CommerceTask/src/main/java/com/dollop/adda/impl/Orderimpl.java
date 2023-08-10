package com.dollop.adda.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.OrderRepo;
import com.dollop.adda.bean.Order;
import com.dollop.adda.service.Orderservice;
@Service
public class Orderimpl implements Orderservice{

	@Autowired
	private OrderRepo or;

	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return this.or.save(order);
	}

	@Override
	public List<Order> getallOrder() {
		// TODO Auto-generated method stub
		return  this.or.findAll();
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return this.or.save(order);
	}

	@Override
	public Order getOrder(Integer id) {
		// TODO Auto-generated method stub
		return this.or.findById(id).get();
	}
}
