package com.example.jsonplaceholder.repos;

import com.example.jsonplaceholder.model.Users;
import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {
}
