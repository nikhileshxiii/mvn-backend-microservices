package com.example.jsonplaceholder.model.embeddable;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    String street;
    String suite;
    String city;
    String zipcode;
    @Embedded
    Geo geo;
}
