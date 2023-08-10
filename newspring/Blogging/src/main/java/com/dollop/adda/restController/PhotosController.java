package com.dollop.app.restController;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dollop.app.entity.Album;
import com.dollop.app.entity.Photos;
import com.dollop.app.exception.PhotoNotFoundException;
import com.dollop.app.service.PhotosService;

@RestController
@RequestMapping("/api/photos")
public class PhotosController {
	@Autowired
	private PhotosService ps;
	
	@GetMapping("")
	private ResponseEntity<List<Photos>> getAllPhotos()
	{
		ResponseEntity<List<Photos>> response = new ResponseEntity<List<Photos>>(this.ps.getAllPhotos(),HttpStatus.OK);
		return response;
	}
	@PostMapping("/albumId/{albumId}")
	public ResponseEntity<?> upload(@RequestParam("Image")MultipartFile file,@PathVariable("albumId")Long albumId) throws IOException{
		Photos photo = new Photos();
		Album album = new Album();
		album.setId(albumId);
		photo.setAlbum(album);
		String uploadImage=ps.addPhoto(file,photo);
		return ResponseEntity.status(HttpStatus.OK).body(uploadImage);
	}
	@PutMapping("/{id}/albumId/{albumId}")
	public ResponseEntity<?> updateByID(@RequestParam("Image")MultipartFile file,@PathVariable("id")Long id,@PathVariable("albumId")Long albumId) throws IOException{
		Photos photo = new Photos();
		Album album = new Album();
		photo.setId(id);
		album.setId(albumId);
		photo.setAlbum(album);
		ResponseEntity<String> response;
		try {
			response = new ResponseEntity<String>(this.ps.updatePhoto(file, photo),HttpStatus.OK);
		} catch (PhotoNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		
		return response;
	}
	@DeleteMapping("/{id}")
	private ResponseEntity<String> deleteByID(@PathVariable Long id)
	{
		ResponseEntity<String> response;
		try {
			response = new ResponseEntity<String>(this.ps.deletePhotoByID(id),HttpStatus.OK);
		} catch (PhotoNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> downloadImage(@PathVariable("id") Long id){
		byte[] imageData=ps.getPhoto(id);
		ResponseEntity<?> response;
		try {
			 response = ResponseEntity.status(HttpStatus.OK).
					contentType(MediaType.valueOf("image/png")).body(imageData);
		} catch (PhotoNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
}
