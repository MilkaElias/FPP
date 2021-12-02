package com.company;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;


public class Employee implements Comparable<Employee> {
    private String name;
    private int salary;
    private LocalDate hireDate;

    public Employee(String name, int salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDate = LocalDate.of(year, month, day);
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }


    @Override
    public int compareTo(Employee o) {
        if(this.name.compareTo(o.name) !=0) return this.name.compareTo(o.name);
        else{
            if(this.salary < o.salary) return -1;
            else if(this.salary>o.salary) return 1;
            else return this.getHireDate().compareTo(o.getHireDate());
        }
    }

    @Override
    public String toString() {
        String output="<name: " + this.name +" salary: " + this.salary+ " hire date: " +this.hireDate +">";
        return output;
    }
}
