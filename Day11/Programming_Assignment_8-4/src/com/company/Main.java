package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<Address> listOfAddresses;
    private StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        Main m = new Main();
        m.loadData();
        m.printAsUpperCase();
        //System.out.println(m.formatFields(m.listOfAddresses.get(0).toUpper()));
    }
    private void loadData(){
        listOfAddresses = new ArrayList<>();
        listOfAddresses.add(new Address("Jim", "101 Adams", "Fairfield", "IA", "52556"));
        listOfAddresses.add(new Address("Tom", "30 W. Burlington", "Fairfield", "IA", "52556"));
        listOfAddresses.add(new Address("Hal", "14 E. Court", "Fairfield", "IA", "52556"));
        listOfAddresses.add(new Address("Sally", "410 W. Jefferson", "Fairfield", "IA", "52556"));
        listOfAddresses.add(new Address("MUM", "1000 N. 4th St", "Fairfield", "IA", "52556"));
    }

    public void printAsUpperCase() {
        listOfAddresses.forEach(address -> System.out.println(formatFields(address.toUpper())));
    }

    private String formatFields(List<String> list) {
        String formattedField=list.get(0)+ "\n"+list.get(1)+"\n"+list.get(2)+", "+list.get(3)+", "+list.get(4)+"\n";
        return formattedField;
    }

}
