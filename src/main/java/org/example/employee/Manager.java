/*
 * Author Name: Divyansh Bhardwaj
 * Date: 26-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package org.example.employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private int teamSize;
    private int rating;
    private double yearlyIncrement;

    public Manager() {
    }

    public Manager(int teamSize, int rating, double yearlyIncrement) {
        this.teamSize = teamSize;
        this.rating = rating;
        this.yearlyIncrement = yearlyIncrement;
    }

    public Manager(String name, int age, LocalDate dateOfBirth, String address, double salary, int teamSize, int rating, double yearlyIncrement) {
        super(name, age, dateOfBirth, address, salary);
        this.teamSize = teamSize;
        this.rating = rating;
        this.yearlyIncrement = yearlyIncrement;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getYearlyIncrement() {
        return yearlyIncrement;
    }

    public void setYearlyIncrement(double yearlyIncrement) {
        this.yearlyIncrement = yearlyIncrement;
    }

    public double calculateYearlyIncrement() {
        if (rating > 8.0) {
            return 12.5;
        } else {
            return 0.0;
        }
    }
}
