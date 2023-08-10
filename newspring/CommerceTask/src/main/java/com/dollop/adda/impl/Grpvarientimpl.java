package com.dollop.adda.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.GrpVarientRepo;
import com.dollop.adda.bean.GrpVarient;
import com.dollop.adda.service.GrpVarientservice;
@Service
public class Grpvarientimpl implements GrpVarientservice{

	@Autowired
	private GrpVarientRepo gvr;
	
	@Override
	public List<GrpVarient> getGrpVarient() {
		// TODO Auto-generated method stub
		return this.gvr.findAll();
	}

	@Override
	public GrpVarient saveGrpVarient(GrpVarient grpvarient) {
		// TODO Auto-generated method stub
		return this.gvr.save(grpvarient);
	}

	@Override
	public GrpVarient getGrpVarient(Integer id) {
		// TODO Auto-generated method stub
		return this.gvr.findById(id).get();
	}

}
