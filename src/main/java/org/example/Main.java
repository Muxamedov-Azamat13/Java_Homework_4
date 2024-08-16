package org.example;

import Work.Employee;
import Work.Supervisor;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Employee("John", "Michael", "Doe", "Software Engineer",
                12345, 100000, 30);
        employees[1] = new Employee("Jane", "Elizabeth", "Smith", "Project Manager",
                12346, 120000, 35);
        employees[2] = new Employee("James", "Robert", "Brown", "QA Engineer",
                12347, 90000, 28);
        employees[3] = new Employee("Emily", "Rose", "Johnson", "UX Designer",
                12348, 85000, 32);
        employees[4] = new Employee("Michael", "James", "Wilson", "DevOps Engineer",
                12349, 110000, 33);
        employees[5] = new Supervisor("Jesika","Liston","Smith",
                "Project Manager", 1234435,55000,34);
        employees[6] = new Supervisor("Mike", "James", "Wilson", "DevOps Engineer",
                123494, 120000, 37);

        Supervisor.setSalary(employees,25000);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

    }
}