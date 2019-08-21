package com.example.jsonplaceholder.wrapper;

import com.example.jsonplaceholder.valueobjects.AlbumsDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlbumsList {
    List<AlbumsDTO> albumsList;
}
