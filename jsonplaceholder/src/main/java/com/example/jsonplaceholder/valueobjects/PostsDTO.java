package com.example.jsonplaceholder.valueobjects;


import lombok.*;

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

