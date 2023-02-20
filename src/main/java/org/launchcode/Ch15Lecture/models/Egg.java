package org.launchcode.Ch15Lecture.models;

import org.intellij.lang.annotations.Identifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.

public class Egg {
    @Id
    @GeneratedValue
    private int id;
    private int sizeInches;
    private int weightKg;
    private String dateLaid;

    private Dinosaur dinosaur;
    public Egg() {
    }

    public Egg(int sizeInches, int weightKg, String dateLaid) {
        this.sizeInches = sizeInches;
        this.weightKg = weightKg;
        this.dateLaid = dateLaid;
    }

    public int getSizeInches() {
        return sizeInches;
    }

    public void setSizeInches(int sizeInches) {
        this.sizeInches = sizeInches;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }

    public String getDateLaid() {
        return dateLaid;
    }

    public void setDateLaid(String dateLaid) {
        this.dateLaid = dateLaid;
    }
}
