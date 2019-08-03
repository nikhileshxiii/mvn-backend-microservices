package com.example.jsonplaceholder.repos;

import com.example.jsonplaceholder.model.Photos;
import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface PhotosRepo extends JpaRepository<Photos, Integer> {
}
