package com.apirest.api_rest.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "codeCity", columnDefinition = "varchar(5)", nullable = false)
    private String codeCity;

    @Column(name = "nameCity", columnDefinition = "varchar(50)", nullable = false)
    private String nameCity;

    @ManyToOne
    @JoinColumn(name = "regionCode")
    private Region region;

    public City () {

    }

    public String getCodeCity() {
        return codeCity;
    }

    public void setCodeCity(String codeCity) {
        this.codeCity = codeCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    
}
