package com.company;

//Main class for Programming Assignment 3-1
public class Main {

    public static void main(String[] args) {
	    Employee employee1= new Employee("Milka Elias", "Milk", 13000, 2021, 4, 25);
        Account account1= new Account(employee1, AccountType.CHECKING,300);
        Account account2= new Account(employee1, AccountType.SAVING,300);
        Account account3= new Account(employee1, AccountType.RETIREMENT,300);
        
        System.out.print(account1);
        System.out.print(account2);
        System.out.println(account3);

    }
}
