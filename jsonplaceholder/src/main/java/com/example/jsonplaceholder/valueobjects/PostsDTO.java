package com.example.jsonplaceholder.valueobjects;


import com.example.jsonplaceholder.model.base.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostsDTO {
    Integer id;
    Integer userId;
    String title;
    String body;
}

