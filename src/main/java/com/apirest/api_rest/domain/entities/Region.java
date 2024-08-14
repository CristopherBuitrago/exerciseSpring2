package com.apirest.api_rest.domain.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Region {
    @Id
    @Column(name = "codeRegion", columnDefinition = "varchar(5)", nullable = false)
    private String codeRegion;

    @Column(name = "nameRegion", columnDefinition = "varchar(50)", nullable = false)
    private String nameRegion;

    @ManyToOne
    @JoinColumn(name = "codeCountry")
    private Country countries;

    @OneToMany(mappedBy = "cities")
    private List<City> cities;


    public Region () {

    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    public Country getCountries() {
        return countries;
    }

    public void setCountries(Country countries) {
        this.countries = countries;
    }

    
    
}
