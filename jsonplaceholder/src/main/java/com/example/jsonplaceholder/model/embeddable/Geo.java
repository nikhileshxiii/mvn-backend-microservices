package com.example.jsonplaceholder.model.embeddable;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Geo {
    String lat;
    String lng;
}
