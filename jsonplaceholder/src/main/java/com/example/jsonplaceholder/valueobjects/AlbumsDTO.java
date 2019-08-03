package com.example.jsonplaceholder.valueobjects;

import com.example.jsonplaceholder.model.base.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlbumsDTO {
    Integer userid;
    Integer Id;
    String title;
}
