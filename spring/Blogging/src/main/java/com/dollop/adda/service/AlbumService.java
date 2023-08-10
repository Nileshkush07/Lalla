package com.dollop.app.service;

import java.util.List;

import com.dollop.app.entity.Album;
import com.dollop.app.entity.Photos;

public interface AlbumService {
	List<Album> getAllAlbums();
	Album getAlbumById(Long id);
	Album save(Album album);
	Album updateAlbumById(Long id,Album album);
	String deleteAlbumById(Long id);
	List<Photos> getAllPhotosByAlbumId(Long lId);
}
