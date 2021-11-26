package com.company;
import java.time.LocalDate;

public class Employee {
        private Account savingsAcct;
        private Account checkingAcct;
        private Account retirementAcct;
        private String name;
        private LocalDate hireDate;
        private Account account;
        public Employee(String name, int yearOfHire,
                        int monthOfHire, int dayOfHire){
            this.name = name;
                //implement
            hireDate=LocalDate.of(yearOfHire,monthOfHire,dayOfHire);
        }

        public void createNewChecking(double startAmount) {
                // implement
                checkingAcct=new Account(this,AccountType.CHECKING,startAmount);
        }
        public void createNewSavings(double startAmount) {
                // implement
                savingsAcct=new Account(this,AccountType.SAVING,startAmount);
        }
        public void createNewRetirement(double startAmount) {
                // implement
                retirementAcct= new Account(this, AccountType.RETIREMENT,startAmount);
        }
        public void deposit(AccountType acctType, double amt){
                if(acctType.equals(checkingAcct.toString())) checkingAcct.makeDeposit(amt);
                if(acctType.equals(savingsAcct.toString())) savingsAcct.makeDeposit(amt);
                if(acctType.equals(retirementAcct.toString())) retirementAcct.makeDeposit(amt);

        }
        public boolean withdraw(AccountType acctType, double amt){
                if(acctType.equals(checkingAcct.toString())){
                        if(checkingAcct.getBalance()<amt) return false;
                        else checkingAcct.makeWithdrawal(amt);
                }
                if(acctType.equals(savingsAcct.toString())){
                        if(savingsAcct.getBalance()<amt) return false;
                        else savingsAcct.makeWithdrawal(amt);
                }
                if(acctType.equals(retirementAcct.toString())){
                        if(retirementAcct.getBalance()<amt) return false;
                        else retirementAcct.makeWithdrawal(amt);
                }
                return true;
        }
        public String getFormattedAcctInfo() {
                String acctInfo=String.format("ACCOUNT INFO for %s\n", name +"\n");
                if(checkingAcct != null) acctInfo +=checkingAcct.toString();
                if(savingsAcct != null) acctInfo +=savingsAcct.toString();
                if(retirementAcct != null) acctInfo +=retirementAcct.toString();
                acctInfo +="\n";
                return acctInfo;

        }

        public String getName(){
                return name;
        }

        public LocalDate getHireDate(){
                return hireDate;
        }
    }

