package com.example.jsonplaceholder.wrapper;

import com.example.jsonplaceholder.valueobjects.CommentsDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentsList {
    List<CommentsDTO> commentsList;
}
