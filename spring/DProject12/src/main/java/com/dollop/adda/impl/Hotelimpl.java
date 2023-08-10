package com.dollop.adda.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.HotelRepo;
import com.dollop.adda.bean.Hotel;
import com.dollop.adda.exception.ResourceNotFoundException;
import com.dollop.adda.service.Hotelservice;
@Service
public class Hotelimpl implements Hotelservice {
	@Autowired
	private HotelRepo hr;

	@Override
	public Hotel create(Hotel hotel) {
		// TODO Auto-generated method stub
		String hotelId=UUID.randomUUID().toString();
		hotel.setId(hotelId);
		
		return this.hr.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return this.hr.findAll();
	}

	@Override
	public Hotel get(Integer id) {
		// TODO Auto-generated method stub
		return this.hr.findById(id).orElseThrow(() -> new ResourceNotFoundException("hotel id not found"));
		}

}
