package com.dollop.adda.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.RatingRepo;
import com.dollop.adda.bean.Rating;
import com.dollop.adda.service.Ratingservice;

@Service
public class Ratingimpl implements Ratingservice {

	@Autowired
	private RatingRepo rr;
	
	@Override
	public Rating create(Rating rating) {
		// TODO Auto-generated method stub
		return this.rr.save(rating);
	}

	@Override
	public List<Rating> getAll() {
		// TODO Auto-generated method stub
		return this.rr.findAll();
	}

	@Override
	public List<Rating> getRatingByuid(Integer uid) {
		// TODO Auto-generated method stub
		return this.rr.findByuid(uid);
	}

	@Override
	public List<Rating> getRatingByhotelid(Integer hotelid) {
		// TODO Auto-generated method stub
		return this.rr.findByhotelid(hotelid);
	}

}
