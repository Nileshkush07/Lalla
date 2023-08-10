package com.dollop.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.dollop.app.entity.Photos;

public interface PhotosService {
	List<Photos> getAllPhotos();
	byte[] getPhoto(Long id) ;
	String addPhoto(MultipartFile file,Photos photo) throws IOException ;
	String updatePhoto(MultipartFile file,Photos photo) throws IOException ;
	Photos updatePhotoByID(Long id,Photos photo);
	String deletePhotoByID(Long id);
}
