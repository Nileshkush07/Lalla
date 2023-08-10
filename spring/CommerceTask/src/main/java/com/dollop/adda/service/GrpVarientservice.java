package com.dollop.adda.service;

import java.util.List;

import com.dollop.adda.bean.GrpVarient;

public interface GrpVarientservice {

	public List<GrpVarient> getGrpVarient();
	
	public GrpVarient saveGrpVarient(GrpVarient grpvarient);
	
	public GrpVarient getGrpVarient(Integer id);
	
	
}
