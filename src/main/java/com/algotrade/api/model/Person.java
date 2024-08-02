package com.algotrade.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class Person {
    @Id
    private long id;
    private String name;
}
