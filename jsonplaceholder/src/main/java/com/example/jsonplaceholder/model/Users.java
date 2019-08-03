package com.example.jsonplaceholder.model;

import com.example.jsonplaceholder.model.base.BaseEntity;
import com.example.jsonplaceholder.model.embeddable.Address;
import com.example.jsonplaceholder.model.embeddable.Company;
import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users extends BaseEntity {
    String name;
    String username;
    String email;

    @Embedded
    Address address;

    String phone;
    String website;

    @Embedded
    Company company;
}
