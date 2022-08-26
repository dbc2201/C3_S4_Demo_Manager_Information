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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
