package com.ssu.employee;

public class Employee {

    int employeeId;
    String firstName;
    String lastName;
    public static int workingDay = 20;

    public Employee(int employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
