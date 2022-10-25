package com.bridgelabz.EmployeePayrollService.Day_27_EmployeePayroll;

public class EmployeePayRollData {
    public int id;
    public String name;
    public double salary;

    public EmployeePayRollData(Integer id, String name, double salary2) {
        this.id = id;
        this.name = name;
        this.salary = salary2;
    }


    public String toString() {
        return "id = " + id + ", Name = " + name + ", salary = " + salary;
    }
}