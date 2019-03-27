package com.Harri.WorldSoccer.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "continents")
public class Continent {

    @Id
    @Column(columnDefinition = "char(2)")
    private String code;

    @Column
    private String name;

    public Continent(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Continent(){}

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
}
