package com.dollop.adda.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.dollop.adda.Repo.CartitemRepo;
import com.dollop.adda.bean.Cart;
import com.dollop.adda.bean.CartItem;
import com.dollop.adda.service.Cartitemservice;

public class Cartitemimpl implements Cartitemservice {

	@Autowired
	private CartitemRepo cir;
	
	@Override
	public CartItem saveCrtItem(CartItem cartitem) {
		// TODO Auto-generated method stub
		return this.cir.save(cartitem);
	}

	@Override
	public CartItem getCartItem(Integer id) {
		// TODO Auto-generated method stub
		return this.cir.findById(id).get();
	}

	@Override
	public CartItem addCartItemwithCartid(CartItem cartitem) {
		// TODO Auto-generated method stub
		Cart ct=new Cart();
		ct.setC_id(null);
		return this.cir.save(cartitem);
	}

}
