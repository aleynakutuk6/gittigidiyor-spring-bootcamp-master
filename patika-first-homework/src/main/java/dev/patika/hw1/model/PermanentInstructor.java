package dev.patika.hw1.model;

import javax.persistence.Entity;

@Entity
public class PermanentInstructor extends Instructor{

    private double hourlySalary;

    public PermanentInstructor() {
    }

    public PermanentInstructor(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }
}
