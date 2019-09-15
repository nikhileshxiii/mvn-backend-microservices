package com.example.GalleryService.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {

    @JsonIgnore
    private int id;

    private int galleryId;

    private String title;

    private String url;

    public Image() {
    }

    public Image(int galleryId, String title, String url) {
        this.galleryId = galleryId;
        this.title = title;
        this.url = url;
    }

    public Image(int id, int galleryId, String title, String url) {
        this.id = id;
        this.galleryId = galleryId;
        this.title = title;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(int galleryId) {
        this.galleryId = galleryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}