package com.dollop.adda.service;

import java.util.List;

import com.dollop.adda.bean.Rating;

public interface Ratingservice {

	Rating create(Rating rating);
	
	List<Rating> getAll();
	
	 List<Rating> getRatingByuid(Integer uid);
	 
	 List<Rating> getRatingByhotelid(Integer hotelid);
	
}
