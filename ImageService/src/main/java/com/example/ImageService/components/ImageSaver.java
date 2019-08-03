package com.example.ImageService.components;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.ImageService.entities.Image;
import com.example.ImageService.jpa.ImageRepository;

@Component
public class ImageSaver implements CommandLineRunner {

	@Autowired
	private ImageRepository imageRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Image> images = Arrays.asList(
				new Image("Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
				new Image("The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
				new Image("The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
		imageRepository.saveAll(images);

	}

}
