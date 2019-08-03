package com.example.jsonplaceholder.config;

import com.example.jsonplaceholder.valueobjects.*;
import com.example.jsonplaceholder.wrapper.*;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
@Configuration
@PropertySource("classpath:base.properties")
public class DbSeeder implements CommandLineRunner {

    @Value("${base.url}")
    String baseUrl;

    // AlbumsRepo albumsRepo;
    // CommentsRepo commentsRepo;
    // PhotosRepo photosRepo;
    // PostsRepo postsRepo;
    // TodosRepo todosRepo;
    // UsersRepo usersRepo;
    RestTemplate restTemplate;

    @Getter
    List<AlbumsDTO> albumsList = new ArrayList<>();
    @Getter
    List<CommentsDTO> commentsList = new ArrayList<>();
    @Getter
    List<PhotosDTO> photosList = new ArrayList<>();
    @Getter
    List<PostsDTO> postsList = new ArrayList<>();
    @Getter
    List<TodosDTO> todosList = new ArrayList<>();
    @Getter
    List<UsersDTO> usersList = new ArrayList<>();

    public DbSeeder( /* AlbumsRepo albumsRepo, CommentsRepo commentsRepo, PhotosRepo photosRepo,
                    PostsRepo postsRepo, TodosRepo todosRepo,
                    UsersRepo usersRepo,*/ RestTemplate restTemplate) {
        // this.albumsRepo = albumsRepo;
        // this.commentsRepo = commentsRepo;
        // this.photosRepo = photosRepo;
        // this.postsRepo = postsRepo;
        // this.todosRepo = todosRepo;
        // this.usersRepo = usersRepo;
        this.restTemplate = restTemplate;
    }



    @Override
    public void run(String... args) throws Exception {
        albumsList = restTemplate.getForObject(baseUrl + "/albums", AlbumsList.class).getAlbumsList();
        commentsList = restTemplate.getForObject(baseUrl + "/comments", CommentsList.class).getCommentsList();
        photosList = restTemplate.getForObject(baseUrl + "/photos", PhotosList.class).getPhotosList();
        postsList = restTemplate.getForObject(baseUrl + "/posts", PostsList.class).getPostsList();
        todosList = restTemplate.getForObject(baseUrl + "/todos", TodosList.class).getTodosList();
        usersList = restTemplate.getForObject(baseUrl + "/users", UsersList.class).getUsersList();
    }
}

