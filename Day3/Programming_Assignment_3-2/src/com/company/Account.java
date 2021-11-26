package com.company;

public class Account {
        private final static double DEFAULT_BALANCE = 0.0;
        private double balance;
        private AccountType acctType;
        private Employee employee;

        Account(Employee emp, AccountType acctType, double balance) {
            employee = emp;
            setAcctType(acctType);
            this.balance = balance;
        }

        Account(Employee emp, AccountType acctType) {
            this(emp, acctType, DEFAULT_BALANCE);
        }


    public String toString() {
        return "Account type = " + acctType + "\n"+ "Current Balance = " + balance +"\n";}

        public void makeDeposit(double deposit) {

            balance +=deposit;
        }

        public boolean makeWithdrawal(double amount) {

            if (amount < balance) {
                balance -=amount;
                return true;
            }

            return false;
        }


        public void setBalance(double balance){
            this.balance=balance;
        }

        public double getBalance() { return balance;}


        public synchronized void setAcctType(AccountType acctType) {
            this.acctType = acctType;
        }


        public AccountType getAcctType() {
            return acctType;
        }
    }


