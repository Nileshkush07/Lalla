package com.dollop.adda.service;

import com.dollop.adda.bean.Cart;

public interface Cartservice {
	
	public Cart saveCart(Cart cart);
	
	public Cart getCart(Integer id);
	
	public Cart addCartItemwithCartid(Cart cart);

}
