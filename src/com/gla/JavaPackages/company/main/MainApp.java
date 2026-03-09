package com.gla.JavaPackages.company.main;

import com.gla.JavaPackages.company.hr.Employee;
import com.gla.JavaPackages.company.payroll.Payroll;

public class MainApp {

    public static void main(String[] args) {

        Employee emp=new Employee(101,"Rahul","IT",50000);
        System.out.println("--- Employee Details Before Bonus ---");
        emp.displayEmployeeDetails();

        Payroll payroll=new Payroll();
        payroll.calculateBonus(emp);

        System.out.println("\n--- Employee Details After 10% Bonus ---");
        emp.displayEmployeeDetails();
    }
}