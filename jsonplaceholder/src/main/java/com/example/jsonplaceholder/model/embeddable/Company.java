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
public class Company {
    String name;
    String catchPhrase;
    String bs;
}
