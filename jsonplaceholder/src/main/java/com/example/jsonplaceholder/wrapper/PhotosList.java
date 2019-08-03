package com.example.jsonplaceholder.wrapper;

import com.example.jsonplaceholder.model.Photos;
import com.example.jsonplaceholder.valueobjects.PhotosDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhotosList {
    List<PhotosDTO> photosList;
}
