package com.example.jsonplaceholder.wrapper;

import com.example.jsonplaceholder.model.Posts;
import com.example.jsonplaceholder.valueobjects.PostsDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostsList {
    List<PostsDTO> postsList;
}
