package dev.patika.hw1.model;

import javax.persistence.Entity;

@Entity
public class VisitingResearcher extends Instructor{

    private double fixedSalary;

    public VisitingResearcher() {
    }

    public VisitingResearcher(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public VisitingResearcher(String name, String address, String phoneNumber, double hourlySalary) {
        super(name, address, phoneNumber);
        this.fixedSalary = fixedSalary;
    }
}
