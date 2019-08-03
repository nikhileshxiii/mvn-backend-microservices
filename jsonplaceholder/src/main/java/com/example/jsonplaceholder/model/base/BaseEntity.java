package com.example.jsonplaceholder.model.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BaseEntity {
    @Id @GeneratedValue
    Integer id;
}
