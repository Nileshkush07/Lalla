package com.dollop.adda.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.AlbumRepo;
import com.dollop.adda.bean.Album;
import com.dollop.service.Albumservice;
@Service
public class Albumimpl implements Albumservice{
	
	@Autowired
	private AlbumRepo ar;

	@Override
	public Album getAlbum(Integer id) {
		// TODO Auto-generated method stub
		return this.ar.findById(id).get();
	}

	@Override
	public List<Album> getallAlbum() {
		// TODO Auto-generated method stub
		return this.ar.findAll();
	}

}
