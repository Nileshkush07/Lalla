package com.dollop.adda.service;

import java.util.List;

import com.dollop.adda.bean.Order;

public interface Orderservice {

	public Order saveOrder(Order order);
	
	public List<Order> getallOrder();
	
	public Order updateOrder(Order order);
	
	public Order getOrder(Integer id);
	
}
