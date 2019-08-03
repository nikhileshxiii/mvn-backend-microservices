package com.example.jsonplaceholder.wrapper;

import com.example.jsonplaceholder.model.Users;
import com.example.jsonplaceholder.valueobjects.UsersDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsersList {
    List<UsersDTO> usersList;
}

