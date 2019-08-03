package com.example.jsonplaceholder.valueobjects;

import com.example.jsonplaceholder.model.base.BaseEntity;
import com.example.jsonplaceholder.model.embeddable.Address;
import com.example.jsonplaceholder.model.embeddable.Company;
import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;

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
