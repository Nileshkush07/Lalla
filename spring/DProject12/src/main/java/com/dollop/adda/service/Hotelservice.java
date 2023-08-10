package com.dollop.adda.service;

import java.util.List;

import com.dollop.adda.bean.Hotel;

public interface Hotelservice {
	
	Hotel create(Hotel hotel);
	
	List<Hotel> getAll();
	
	Hotel get(Integer id);

}
