package com.example.jsonplaceholder.valueobjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PhotosDTO {
    Integer id;
    Integer albumId;
    String title;
    String url;
    String thumbnailUrl;
}
