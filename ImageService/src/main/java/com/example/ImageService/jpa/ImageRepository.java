package com.example.ImageService.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ImageService.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}
