package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {
    public static void main(String[] args) {
        Employee[] empArray =
                {new Employee("George", 40000, 1996,11,5),
                        new Employee("Dave", 50000, 2000, 1, 3),
                        new Employee("Richard", 45000, 2001, 2, 7)};
        List<Employee> empList = Arrays.asList(empArray);
        NameComparator nameComp = new NameComparator();
        SalaryComparator salComp=new SalaryComparator();
        HireDateComparator hdComp=new HireDateComparator();

        Collections.sort(empList, nameComp);
        System.out.println("By Name: \n" + empList);

        Collections.sort(empList, salComp);
        System.out.println("By Salary: \n" + empList);

        Collections.sort(empList, hdComp);
        System.out.println("By HireDate: \n" + empList);

    }


}
