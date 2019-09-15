package com.example.GalleryService.service;

import com.example.GalleryService.dto.Image;
import com.example.GalleryService.entities.Gallery;
import com.example.GalleryService.repo.GalleryRepo;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GalleryService {

    private GalleryRepo galleryRepo;
    private RestTemplate restTemplate;

    public GalleryService(GalleryRepo galleryRepo, RestTemplate restTemplate) {
        this.galleryRepo = galleryRepo;
        this.restTemplate = restTemplate;
    }

    public Gallery getGalleryById(Integer id) {
        Optional<Gallery> optionalGallery = galleryRepo.findById(id);
        if (optionalGallery.isPresent()) {
            List<Image> images = (List<Image>) restTemplate.getForObject("http://image-service:8200/images/gallery/" + id, List.class);
            Gallery gallery = optionalGallery.get();
            gallery.setImages(images);
            return gallery;
        } else {
            return null;
        }
    }

    public Gallery saveGallery(Gallery gallery) {
        Gallery savedGallery = galleryRepo.save(gallery);
        List<Image> images = gallery.getImages();
        List<Image> savedImages = images.stream().map(image -> {
            image.setGalleryId(savedGallery.getId());
            HttpEntity<Image> httpEntity = new HttpEntity<>(image);;
            Image image1 = restTemplate.postForObject("http://image-service:8200/images/save", httpEntity, Image.class);
            return image1;
        }).collect(Collectors.toList());
        savedGallery.setImages(savedImages);
        return savedGallery;
    }

    public List<Gallery> getAllGalleries() {
        List<Gallery> galleries = galleryRepo.findAll();
        /* List<Gallery> galleriesWithImages = galleries.stream().map(   gallery -> {
            List<Image> images = restTemplate.getForObject("http://image-service/images/gallery" + gallery.getId(), List.class);
            return new Gallery(gallery.getId(), gallery.getGalleryName(), Collections.singletonList(images));
        }).collect(Collectors.toList());
        */

        List<Gallery> galleriesWithImages = new ArrayList<>();
        for (Gallery gallery : galleries) {
            List<Image> images = restTemplate.getForObject("http://image-service:8200/images/gallery/" + gallery.getId(), List.class);
            galleriesWithImages.add(new Gallery(gallery.getId(), gallery.getGalleryName(), images));
        }
        return galleriesWithImages;
    }
}
