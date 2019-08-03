package com.example.jsonplaceholder.repos;

import com.example.jsonplaceholder.model.Albums;
import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface AlbumsRepo extends JpaRepository<Albums, Integer> {
}
