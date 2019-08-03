package com.example.jsonplaceholder.valueobjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TodosDTO {
    Integer id;
    Integer userId;
    String title;
    Boolean completed;
}
