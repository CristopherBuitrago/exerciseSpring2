package com.apirest.api_rest.domain.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "codeCountry", columnDefinition = "varchar(5)", nullable = false)
    private String codeCountry;

    @Column(name = "nameCountry", columnDefinition = "varchar(50)", nullable = false)
    private String nameCountry;

    @OneToMany(mappedBy = "")
    private List<Region> regions;

    public Country () {

    }

    public String getCodeCountry() {
        return codeCountry;
    }

    public void setCodeCountry(String codeCountry) {
        this.codeCountry = codeCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    
    
}
