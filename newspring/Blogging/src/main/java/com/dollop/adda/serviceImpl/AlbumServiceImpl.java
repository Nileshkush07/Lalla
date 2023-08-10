package com.dollop.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.app.entity.Album;
import com.dollop.app.entity.Photos;
import com.dollop.app.exception.AlbumNotFoundException;
import com.dollop.app.exception.PhotoNotFoundException;
import com.dollop.app.repository.AlbumRepo;
import com.dollop.app.service.AlbumService;
@Service
public class AlbumServiceImpl implements AlbumService {
	@Autowired
	private AlbumRepo ar;
	@Override
	public List<Album> getAllAlbums() {
		
		return this.ar.findAll();
	}

	@Override
	public Album getAlbumById(Long id) {
		Optional<Album> album = this.ar.findById(id);
		if(album.isPresent())
		{
			return this.ar.findById(id).get();
		}
		throw new AlbumNotFoundException("Album Not Found Id :"+id);
	}

	@Override
	public Album save(Album album) {
		
		return this.ar.save(album);
	}

	@Override
	public Album updateAlbumById(Long id , Album album1) {
		Optional<Album> album = this.ar.findById(id);
		if(album.isPresent())
		{
			return this.ar.save(album1);
		}
		throw new AlbumNotFoundException("Album Not Found Id :"+id);
	}

	@Override
	public String deleteAlbumById(Long id) {
		Optional<Album> album = this.ar.findById(id);
		if(album.isPresent())
		{
			this.ar.deleteById(id);
			return "Album Deleted";
		}
		throw new AlbumNotFoundException("Album Not Found Id :"+id);
	}

	@Override
	public List<Photos> getAllPhotosByAlbumId(Long lId) {
		Optional<Album> album = this.ar.findById(lId);
		if(album.isPresent())
		{
			return album.get().getPhotos();
		}
		throw new PhotoNotFoundException("Photo Not Found ID : "+lId);
	}

}
