package com.bridgelabz.EmployeePayrollService.Day_27_EmployeePayroll;

public class EmployeePayRollData
{
    private int employeeId;
    private String employeeName;
    private int employeeSalary;

    public EmployeePayRollData(int employeeId, String employeeName, int employeeSalary)
    {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
                + employeeSalary + "";
    }
}