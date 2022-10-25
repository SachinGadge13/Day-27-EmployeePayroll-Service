package com.bridgelabz.EmployeePayrollService.Day_27_EmployeePayroll;


public class EmployeePayrollMain {
    public static void main(String[] args) {
        EmployeePayRollImpl employeePayrollService = new EmployeePayRollImpl();
        System.out.println("Welcolme to employee payRoll");
        employeePayrollService.readEmployeeDataFromConsole();
        employeePayrollService.writeEmployeeDataInConsole();
    }
}