package com.example.jsonplaceholder.model;


import com.example.jsonplaceholder.model.base.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Posts extends BaseEntity {
//    @Column(table = "Users", name = "id")
    Integer userId;
    String title;
    String body;
}

