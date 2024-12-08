package com.matdev.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pokemon {
    @Id
    private int id;
    private String name;
    private String type;
    private String heightFt;
    private float heightM;
    private float weightLbs;
    private float weightKgs;

    public Pokemon(int id, String name, String type, String heightFt, float heightM, float weightLbs, float weightKgs) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.heightFt = heightFt;
        this.heightM = heightM;
        this.weightLbs = weightLbs;
        this.weightKgs = weightKgs;
    }

    public Pokemon() {
    }
}
