package com.example.jsonplaceholder.repos;


import com.example.jsonplaceholder.model.Posts;
import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepo extends JpaRepository<Posts, Integer> {
}

