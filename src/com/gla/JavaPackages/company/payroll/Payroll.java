package com.gla.JavaPackages.company.payroll;

import com.gla.JavaPackages.company.hr.Employee;

public class Payroll {

    public void calculateBonus(Employee e) {
        double bonus=e.getSalary()*0.10;
        e.setSalary(e.getSalary()+bonus);
    }
}