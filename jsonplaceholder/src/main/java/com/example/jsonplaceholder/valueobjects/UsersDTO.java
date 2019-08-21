package com.example.jsonplaceholder.valueobjects;

import com.example.jsonplaceholder.model.embeddable.Address;
import com.example.jsonplaceholder.model.embeddable.Company;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsersDTO {
    Integer id;
    String name;
    String username;
    String email;

    Address address;

    String phone;
    String website;

    Company company;
}
