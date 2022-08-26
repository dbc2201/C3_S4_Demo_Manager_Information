/*
 * Author Name: Divyansh Bhardwaj
 * Date: 26-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package org.example.employee;

import java.time.LocalDate;

public class RegionalHead extends Employee {
    private String regionName;
    private int regionPerformance;
    private int reviewRatings;

    public RegionalHead() {
    }

    public RegionalHead(String name, int age, LocalDate dateOfBirth, String address, double salary, String regionName, int regionPerformance, int reviewRatings) {
        super(name, age, dateOfBirth, address, salary);
        this.regionName = regionName;
        this.regionPerformance = regionPerformance;
        this.reviewRatings = reviewRatings;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public int getRegionPerformance() {
        return regionPerformance;
    }

    public void setRegionPerformance(int regionPerformance) {
        this.regionPerformance = regionPerformance;
    }

    public int getReviewRatings() {
        return reviewRatings;
    }

    public void setReviewRatings(int reviewRatings) {
        this.reviewRatings = reviewRatings;
    }

    public double calculateYearlyIncrement() {
        if (regionPerformance > 8 && reviewRatings > 7) {
            return 10.5;
        } else {
            return 0.0;
        }
    }
}
