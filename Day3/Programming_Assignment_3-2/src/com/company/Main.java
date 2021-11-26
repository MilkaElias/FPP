package com.company;
import java.util.Scanner;

//Main class for Programming Assignment 3-2
public class Main {
    Employee emps;
    public static void main(String[] args) {
        new Main();
    }
    Main() {
        emps = new Employee("Jim Daley", 2000, 9, 4);
        emps.createNewChecking(10500);
        emps.createNewSavings(1000);
        emps.createNewRetirement(9300);
        Scanner sc=new Scanner(System.in);
        System.out.println("See a report of all account balances? (y/n)");
        String input=sc.nextLine();
        sc.close();

        if(input.charAt(0)=='y'){
            String formattedInfo= emps.getFormattedAcctInfo();
            System.out.println(formattedInfo);
        }
        else{
            System.out.println("Please rerun the program, application exited!");
        }
    }

}

