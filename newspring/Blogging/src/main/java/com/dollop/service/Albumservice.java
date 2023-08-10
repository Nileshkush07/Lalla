package com.dollop.service;

import java.util.List;

import com.dollop.adda.bean.Album;

public interface Albumservice {
	
public Album  getAlbum(Integer id);
	
	public List<Album> getallAlbum();

}
