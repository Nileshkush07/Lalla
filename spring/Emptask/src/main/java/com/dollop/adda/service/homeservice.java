package com.dollop.adda.service;

import java.util.List;

import org.springframework.ui.Model;

import com.dollop.adda.bean.address;

public interface homeservice {

public  address saveAddress(address addrs);
	
	public List<address> getallAddress();
	
	public address  updateAddress(address addrs,Model model);
	
	public  String deleteAddress(Integer Id);
	
	public  address getAddress(Integer Id);
}
