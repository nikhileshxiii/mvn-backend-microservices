package com.example.GalleryService.service;

import com.example.GalleryService.dto.Image;
import com.example.GalleryService.entities.Gallery;
import com.example.GalleryService.repo.GalleryRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

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
            List<Image> images = (List<Image>) restTemplate.getForObject("http://image-service/images/gallery/" + id, List.class);
            Gallery gallery = optionalGallery.get();
            gallery.setImages(Collections.singletonList(images));
            return gallery;
        } else {
            return null;
        }
    }

    public Gallery saveGallery(Gallery gallery) {
        return galleryRepo.save(gallery);
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
            List<Image> images = restTemplate.getForObject("http://image-service/images/gallery/" + gallery.getId(), List.class);
            galleriesWithImages.add(new Gallery(gallery.getId(), gallery.getGalleryName(), Collections.singletonList(images)));
        }
        return galleriesWithImages;
    }
}
