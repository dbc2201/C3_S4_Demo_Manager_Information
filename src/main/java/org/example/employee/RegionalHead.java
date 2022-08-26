/*
 * Author Name: Divyansh Bhardwaj
 * Date: 26-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package org.example.employee;

import java.time.LocalDate;

public class RegionalHead extends Employee {
    private String regionName;
    private String regionPerformance;
    private int reviewRatings;

    public RegionalHead() {
    }

    public RegionalHead(String name, int age, LocalDate dateOfBirth, String address, double salary, String regionName, String regionPerformance, int reviewRatings) {
        super(name, age, dateOfBirth, address, salary);
        this.regionName = regionName;
        this.regionPerformance = regionPerformance;
        this.reviewRatings = reviewRatings;
    }
}
