package com.example.jsonplaceholder.controllers;

import com.example.jsonplaceholder.config.DbSeeder;
import com.example.jsonplaceholder.valueobjects.UsersDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    DbSeeder dbSeeder;

    public UsersController(DbSeeder dbSeeder) {
        this.dbSeeder = dbSeeder;
    }

    @GetMapping("/users")
    public List<UsersDTO> getAllUsers() {
        return dbSeeder.getUsersList();
    }

    @GetMapping("/user/{id}")
    public UsersDTO getUserById(@PathVariable Integer id) {
        return (UsersDTO) dbSeeder.getUsersList().stream().filter(usersDTO -> usersDTO.getId() == id);
    }
}
