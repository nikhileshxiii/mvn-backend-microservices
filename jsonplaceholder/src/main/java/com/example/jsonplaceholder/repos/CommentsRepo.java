package com.example.jsonplaceholder.repos;

import com.example.jsonplaceholder.model.Comments;
import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface CommentsRepo extends JpaRepository<Comments, Integer> {
}
