package com.apirest.api_rest.domain.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.*;

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @Column(name = "idPerson", columnDefinition = "VARCHAR(20)", nullable = false)
    private String id;

    @Column(name = "firstName", columnDefinition = "VARHCAR(50)", nullable = false)
    private String firstName;

    @Column(name = "lastName", columnDefinition = "VARCHAR(50)", nullable = false)
    private String lastName;

    @ManyToOne
    City cities;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "persons")
    private Set<TypePerson> typePersons;       

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public City getCities() {
        return cities;
    }

    public void setCities(City cities) {
        this.cities = cities;
    }

}
