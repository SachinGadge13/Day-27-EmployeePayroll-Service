package com.bridgelabz.EmployeePayrollService.Day_27_EmployeePayroll;

import java.util.List;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollImpl
{

    private List<EmployeePayRollData> employeePayrollDataList;

    public EmployeePayRollImpl(List<EmployeePayRollData> employeePayrollDataList)
    {
        this.employeePayrollDataList = employeePayrollDataList;
    }

    void readEmployeePayrollData(Scanner consoleInputReader)
    {
        System.out.print("Enter Employee-Id : ");
        int id = consoleInputReader.nextInt();
        System.out.print("Enter Employee-Name : ");
        String name = consoleInputReader.next();
        System.out.print("Enter Employee-Salary : ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollDataList.add(new EmployeePayRollData(id, name, salary));
    }

    void writeEmployeePayrollData()
    {
        System.out.println("\nWriting Employee Payroll To Console:\n" + employeePayrollDataList);
    }

}