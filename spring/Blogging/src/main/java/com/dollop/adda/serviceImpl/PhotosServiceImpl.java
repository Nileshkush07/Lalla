package com.dollop.app.serviceImpl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dollop.app.entity.Photos;
import com.dollop.app.exception.PhotoNotFoundException;
import com.dollop.app.repository.PhotosRepo;
import com.dollop.app.service.PhotosService;

@Service
public class PhotosServiceImpl implements PhotosService {
	@Autowired
	private PhotosRepo pr;

	@Override
	public List<Photos> getAllPhotos() {
		// TODO Auto-generated method stub
		return this.pr.findAll();
	}

	@Override
	public Photos updatePhotoByID(Long id, Photos photo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletePhotoByID(Long id) {
		Optional<Photos> photo = this.pr.findById(id);
		if (photo.isPresent()) {
			this.pr.deleteById(id);
			return "Photo Deleted";
		}
		throw new PhotoNotFoundException("Photo Not Found ID : " + id);
	}

	@Override
	public byte[] getPhoto(Long id) {
		Optional<Photos> photo = pr.findById(id);

		if (photo.isPresent()) {
			byte[] pho = ImageUtils.decompressImage(photo.get().getImagedata());
			return pho;
		}
		throw new PhotoNotFoundException("Photo Not Found ID : " + id);
	}

	@Override
	public String addPhoto(MultipartFile file, Photos photo) throws IOException {
		// TODO Auto-generated method stub
		photo.setImagedata(ImageUtils.compressImage(file.getBytes()));
		photo.setTitle(file.getOriginalFilename());
		photo.setThumbnaiUrl(file.getContentType());
//		Photos pe = pr.save(Photos.builder().title(file.getOriginalFilename()).thumbnaiUrl(file.getContentType())
//				.imagedata(ImageUtils.compressImage(file.getBytes())).build());
		Photos pe = this.pr.save(photo);
		if (pe != null) {
			return "file uploaded Succes " + file.getOriginalFilename();
		}
		return "Something Went Wrong";
	}

	@Override
	public String updatePhoto(MultipartFile file, Photos photo) throws IOException {
		
		
//		Photos pe = pr.save(Photos.builder().title(file.getOriginalFilename()).thumbnaiUrl(file.getContentType())
//				.imagedata(ImageUtils.compressImage(file.getBytes())).build());
		Optional<Photos> pe = this.pr.findById(photo.getId());
		if (pe.isPresent()) {
			photo.setImagedata(ImageUtils.compressImage(file.getBytes()));
			photo.setTitle(file.getOriginalFilename());
			photo.setThumbnaiUrl(file.getContentType());
			this.pr.save(photo);
			return "file Update Succes " + file.getOriginalFilename();
		}
		throw new PhotoNotFoundException("Photo Not Found ID : "+photo.getId());
	}
}
