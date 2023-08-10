package com.dollop.app.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.app.entity.Album;
import com.dollop.app.entity.Photos;
import com.dollop.app.exception.AlbumNotFoundException;
import com.dollop.app.service.AlbumService;

@RestController
@RequestMapping("/api/albums")
public class AlbumController {
	@Autowired
	private AlbumService as;
	
	@GetMapping("")
	private ResponseEntity<List<Album>> getAllAlbum()
	{
		ResponseEntity<List<Album>> response = new ResponseEntity<List<Album>>(this.as.getAllAlbums(),HttpStatus.OK);
		return response;
	}
	@GetMapping("/{id}")
	private ResponseEntity<Album> getAlbumById(@PathVariable("id") Long id)
	{
		ResponseEntity<Album> response ;
		try {
			response = new ResponseEntity<Album>(this.as.getAlbumById(id),HttpStatus.OK);
		} catch (AlbumNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
	@PostMapping("")
	private ResponseEntity<Album> save(@RequestBody Album album)
	{
		ResponseEntity<Album> respponse = new ResponseEntity<Album>(this.as.save(album),HttpStatus.OK);
		return respponse;
	}
	@PutMapping("/{id}")
	private ResponseEntity<Album> updateAlbumById(@PathVariable("id")Long id,@RequestBody Album album)
	{
		ResponseEntity<Album> response;
		album.setId(id);
		try {
			response = new ResponseEntity<Album>(this.as.updateAlbumById(id, album),HttpStatus.OK);
		} catch (AlbumNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
	@DeleteMapping("/{id}")
	private ResponseEntity<String> deleteAlbumByID(@PathVariable("id")Long id)
	{
		ResponseEntity<String> response;
		try {
			response = new ResponseEntity<String>(this.as.deleteAlbumById(id),HttpStatus.OK);
			
		} catch (AlbumNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
	@GetMapping("/{id}/photos")
	private ResponseEntity<List<Photos>> getAllPhotosByAlbumID(@PathVariable("id")Long id)
	{
		ResponseEntity<List<Photos>> response;
		try {
			response = new ResponseEntity<List<Photos>>(this.as.getAllPhotosByAlbumId(id),HttpStatus.OK);
		} catch (AlbumNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}

}
