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
public class Photos extends BaseEntity {

    Integer albumId;
    String title;
    String url;
    String thumbnailUrl;
}
