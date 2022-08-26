package org.example;

import org.example.employee.Employee;
import org.example.employee.Manager;
import org.example.employee.RegionalHead;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String name = "Divyansh Bhardwaj";
        int age = 26;
        LocalDate dateOfBirth = LocalDate.of(2022, 8, 26);
        String address = "Pune";
        double salary = 100000.0;
        Employee employee = new Employee(
                name,
                age,
                dateOfBirth,
                address,
                salary
        );
        System.out.println(employee.getName());
        Manager manager = new Manager(
                name,
                age,
                dateOfBirth,
                address,
                salary,
                10, 8, 12.5
        );
        System.out.println("manager = " + manager.getName());
        RegionalHead regionalHead = new RegionalHead(
                name,
                age,
                dateOfBirth,
                address,
                salary,
                "Pune",
                10,
                9
        );
        System.out.println("regionalHead = " + regionalHead.getName());
    }
}