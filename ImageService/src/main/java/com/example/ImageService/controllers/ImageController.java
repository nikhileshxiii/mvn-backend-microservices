package com.example.ImageService.controllers;

import com.example.ImageService.entities.Image;
import com.example.ImageService.repos.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/images")
public class ImageController {
    @Autowired
    private Environment env;

    @Autowired
    private ImageRepository imageRepository;

    @RequestMapping("/home")
    public String getHome() {
        return "Welcome to Image Application";
    }

    @RequestMapping("/all")
    public List<Image> getImages() {
        return imageRepository.findAll();
    }

    @GetMapping({"/{id}"})
    public Image getImage(@PathVariable int id) {
        Optional<Image> image = imageRepository.findById(id);
        if (image.isPresent()) return image.get();
        else return null;
    }

    @GetMapping("/gallery/{id}")
    public List<Image> getImagesByGallery(@PathVariable final int id) {
        return imageRepository.findByGalleryId(id);
    }

    @PostMapping("/save")
    public int saveImage(@org.jetbrains.annotations.NotNull @RequestBody Image image) {
        image.setGalleryId((Integer)image.getGalleryId());
        Image savedImage = imageRepository.save(image);
        return savedImage.getId();
    }
}