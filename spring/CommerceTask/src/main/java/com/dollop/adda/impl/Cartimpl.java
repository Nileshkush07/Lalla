package com.dollop.adda.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.dollop.adda.Repo.CartRepo;
import com.dollop.adda.bean.Cart;
import com.dollop.adda.bean.CartItem;
import com.dollop.adda.service.Cartservice;

public class Cartimpl implements Cartservice{

	@Autowired
	private CartRepo cr;
	
	@Override
	public Cart saveCart(Cart cart) {
		// TODO Auto-generated method stub
		return this.cr.save(cart);
	}

	@Override
	public Cart getCart(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart addCartItemwithCartid(Cart cart) {
		// TODO Auto-generated method stub
		CartItem crt=new CartItem();
		crt.setCi_id(null);
		return this.cr.save(cart);
		
	}

}
