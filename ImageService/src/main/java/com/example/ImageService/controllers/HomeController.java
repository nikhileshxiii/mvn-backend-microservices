package com.example.ImageService.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ImageService.entities.Image;
import com.example.ImageService.jpa.ImageRepository;

@RestController
@RequestMapping("/")
public class HomeController {
	@Autowired
	private Environment env;

	@Autowired
	private ImageRepository imageRepository;

	@RequestMapping("/images")
	public List<Image> getImages() {
		return imageRepository.findAll();
//		return savedImages();
	}

	@GetMapping({ "/images/{id}" })
	public Optional<Image> getImage(@PathVariable int id) {
		return imageRepository.findById(id);
	}
}