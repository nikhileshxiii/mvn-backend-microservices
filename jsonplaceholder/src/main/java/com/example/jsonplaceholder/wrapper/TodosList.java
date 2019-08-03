package com.example.jsonplaceholder.wrapper;

import com.example.jsonplaceholder.model.Todos;
import com.example.jsonplaceholder.valueobjects.TodosDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TodosList {
    List<TodosDTO> todosList;
}
