package com.vart.demo.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "person")
public class Person implements Serializable{
    private static final long serialVersionUID = 7247714666080613254L;

    @Id
    @Column (name = "id")
    @NotNull
    @GeneratedValue (strategy = GenerationType.AUTO)
    public Long id;

    @Column (name = "name")
    @NotNull
    public String name;

    public Person(String name) {
        this.id = 0L;//must be set a default value or throws an exception...
        this.name = name;
    }

    public Person() {
        this.id = 0L;
    }
}
