package com.example.demo.entidad1;

import com.example.demo.entidad2.Person;
import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "groups")
public class Group{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @OneToMany
    private Set<Person> persons;

    // Constructores

    public Group() {}

    public Group(Long id, String name, Set<Person> persons) {
        this.id = id;
        this.name = name;
        this.persons = persons;
    }

    // Getters

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Set<Person> getPersons() {
        return this.persons;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

}