package com.dollop.adda.service;

import com.dollop.adda.bean.CartItem;

public interface Cartitemservice {
	
	public CartItem saveCrtItem(CartItem cartitem);
	
	public CartItem getCartItem(Integer id);
	
	public CartItem addCartItemwithCartid(CartItem cartitem);
	

}
