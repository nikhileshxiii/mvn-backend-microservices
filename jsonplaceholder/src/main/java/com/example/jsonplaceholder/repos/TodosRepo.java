package com.example.jsonplaceholder.repos;

import com.example.jsonplaceholder.model.Todos;
import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodosRepo extends JpaRepository<Todos, Integer> {
}
