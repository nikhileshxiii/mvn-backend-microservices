package com.example.jsonplaceholder.model;

import com.example.jsonplaceholder.model.base.BaseEntity;
import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comments extends BaseEntity {
    Integer postId;
    String name;
    String email;
    String body;
}
