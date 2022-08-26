/*
 * Author Name: Divyansh Bhardwaj
 * Date: 26-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package org.example.employee;

import java.time.LocalDate;

public class Employee {
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private String address;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, LocalDate dateOfBirth, String address, double salary) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.salary = salary;
    }
}
