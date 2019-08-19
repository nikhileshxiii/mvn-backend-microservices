package com.example.GalleryService.seeder;

import com.example.GalleryService.entities.Gallery;
import com.example.GalleryService.repo.GalleryRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DBSeeder implements CommandLineRunner {

    private GalleryRepo galleryRepo;

    public DBSeeder(GalleryRepo galleryRepo) {
        this.galleryRepo = galleryRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        List<String> galleryNames = new ArrayList<>();
        galleryNames.add("galleryone");
        galleryNames.add("gallerytwo");
        galleryNames.add("gallerythree");
        galleryNames.add("Meg");
        galleryNames.stream().forEach(galleryName -> galleryRepo.save(new Gallery(galleryName)));
    }
}
