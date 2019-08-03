package com.example.jsonplaceholder.valueobjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentsDTO {
    Integer id;
    Integer postId;
    String name;
    String email;
    String body;
}
