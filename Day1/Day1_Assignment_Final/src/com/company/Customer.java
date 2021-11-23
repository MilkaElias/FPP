package com.company;

public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;

    //Constructor
    public Customer(String fname, String lname, String ssn){
        firstName=fname;
        lastName=lname;
        socSecurityNum=ssn;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSocSecurityNum() {
        return socSecurityNum;
    }
    public Address getBillingAddress() {
        return billingAddress;
    }
    public Address getShippingAddress() {
        return shippingAddress;
    }

    //Setters
    public void setFirstName(String fn){
        firstName=fn;
    }

    public void setLastName(String ln){
        lastName=ln;
    }

    public void setSocSecurityNum(String ssn){
        socSecurityNum=ssn;
    }
    public void setBillingAddress(Address ba){
        billingAddress=ba;
    }
    public void setShippingAddress(Address sa){
        shippingAddress=sa;
    }



    //ToString
    @Override
    public String toString() {
        return "[" + firstName  + ", " + lastName + " , " + "ssn: "+ socSecurityNum + "]";
    }

}
