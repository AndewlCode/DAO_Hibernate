package com.example.dao_hibernate.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class PersonKey implements java.io.Serializable {
    private String name;
    private String surname;
    private int age;
}