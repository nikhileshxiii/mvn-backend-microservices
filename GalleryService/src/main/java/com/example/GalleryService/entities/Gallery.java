package com.example.GalleryService.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String galleryName;
    @Transient
    private List<Object> images;

    public Gallery(String galleryName) {
        this.galleryName = galleryName;
    }

    public Gallery() {

    }

    public Gallery(String galleryName, List<Object> images) {
        this.galleryName = galleryName;
        this.images = images;
    }

    public Gallery(int id, String galleryName, List<Object> images) {
        this.id = id;
        this.galleryName = galleryName;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Object> getImages() {
        return images;
    }

    public void setImages(List<Object> images) {
        this.images = images;
    }

    public String getGalleryName() {
        return galleryName;
    }

    public void setGalleryName(String galleryName) {
        this.galleryName = galleryName;
    }

}
