package com.example.jsonplaceholder.model;

import com.example.jsonplaceholder.model.base.BaseEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todos extends BaseEntity {
    //    @Column(table = "Users", name = "id")
    Integer userId;
    String title;
    Boolean completed;
}
