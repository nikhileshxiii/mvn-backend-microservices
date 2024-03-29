package com.example.GalleryService.controllers;


import com.example.GalleryService.entities.Gallery;
import com.example.GalleryService.service.GalleryService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/galleries")
public class GalleryController {
    private RestTemplate restTemplate;
    private Environment env;
    private GalleryService galleryService;

    //    @Value("${local.server.port}")
    @Value("${server.port}")
    private String port;

    public GalleryController(RestTemplate restTemplate, Environment env, GalleryService galleryService) {
        this.restTemplate = restTemplate;
        this.env = env;
        this.galleryService = galleryService;
    }

    @RequestMapping("/home")
    public String home() {
        // This is useful for debugging
        // When having multiple instance of gallery service running at different ports.
        // We load balance among them, and display which instance received the request.
        return "Hello from Gallery Service running at port: " + port;
    }

    @GetMapping("/all")
    public List<Gallery> getAllGalleries() {
        return galleryService.getAllGalleries();
    }

    @GetMapping("/{id}")
    public Gallery getGalleryById(@PathVariable final int id) {
        Gallery gallery = galleryService.getGalleryById(id);
        return gallery;
    }

    @PostMapping("/save")
    public Gallery saveGallery(@RequestBody Gallery gallery) {
        return galleryService.saveGallery(gallery);
    }

    // -------- Admin Area --------
    // This method should only be accessed by users with role of 'admin'
    // We'll add the logic of role based auth later
    @RequestMapping("/admin")
    public String homeAdmin() {
        return "This is the admin area of Gallery service running at port: " + port;
    }
}
