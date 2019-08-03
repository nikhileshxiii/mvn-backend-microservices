package com.example.jsonplaceholder.model;

import com.example.jsonplaceholder.model.base.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Albums extends BaseEntity {
//    @ManyToOne
    Integer userId;
    String title;
}
