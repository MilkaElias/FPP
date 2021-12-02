package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Professor p1 = new Professor("Max", 7200, LocalDate.of(2021, 1,10), 10);
        Professor p2 = new Professor("Aven", 5500, LocalDate.now().minusDays(5), 10);
        Professor p3 = new Professor("Milka", 18600, LocalDate.now(), 10);
        Secretary s1 = new Secretary("Tomy", 3200, LocalDate.of(2020,11,10), 200);
        Secretary s2 = new Secretary("Bella", 2310, LocalDate.now(), 200);




        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = p1;
        department[1] = p2;
        department[2] = p3;
        department[3] = s1;
        department[4] = s2;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nDo you want to see the total salary? (Y/n): ");
        String response = sc.nextLine();
        sc.close();
        if (response.charAt(0) == 'Y' || response.charAt(0) == 'y') {
            double totalSalary = 0;
            for (DeptEmployee d : department)
                totalSalary += d.computeSalary();
            System.out.println(totalSalary);
        }
    }
}


