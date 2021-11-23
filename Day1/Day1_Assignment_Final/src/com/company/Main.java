package com.company;

public class Main {

    public static void main(String[] args) {
        Address c1billing = new Address("10 Adams", "Fairfield", "IA", "52556");
        Address c1shipping = new Address("110 Burlington", "Fairfield", "IA", "52556");
        Address c2billing = new Address("322 Harrison", "Chicago", "Illinois", "52559");
        Address c2shipping = new Address("2210 Burlington", "Chicago", "Illinois", "52559");

        Customer c1 = new Customer("Bill", "Jones", "327-344-9807");
        c1.setShippingAddress(c1shipping);
        c1.setBillingAddress(c1billing);

        Customer c2 = new Customer("Maya", "Bella", "157-345-1234");
        c2.setShippingAddress(c2shipping);
        c2.setBillingAddress(c2billing);


        //Create a Customer array of length 2
        Customer[] customerArray = new Customer[2];
        customerArray[0] = c1;
        customerArray[1] = c2;


        for(int i=0;i< customerArray.length;i++){
            String billingCity= customerArray[i].getBillingAddress().getCity();
            if(billingCity.equals("Chicago")) System.out.println(customerArray[i]);

        }
    }
}
