package com.Harri.WorldSoccer.Model;

import javax.persistence.*;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @Column(columnDefinition = "char(2)")
    private String code;

    private String name;

    private String fullName;

    @Column(columnDefinition = "char(3)")
    private String iso3;

    @Column(columnDefinition = "smallint(3)")
    private int number;

    @ManyToOne
    private Continent continent;

    public Country(String code, String name, String fullName, String iso3, int number, Continent continent) {
        this.code = code;
        this.name = name;
        this.fullName = fullName;
        this.iso3 = iso3;
        this.number = number;
        this.continent = continent;
    }

    public Country() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
