package com.company;

import java.util.ArrayList;
import java.util.List;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    public Address(String name, String street, String city, String state, String zip) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public String getName() {
        return name;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getZip() {
        return zip;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    @SuppressWarnings("serial")
    public List<String> asList() {
        List<String> list = new ArrayList<String>();
        list.add(name);
        list.add(street);
        list.add(city);
        list.add(state);
        list.add(zip);
        return list;

    }
    /** Converts address fields to upper case, returns as list */
    //implement
    public List<String> toUpper() {
        List<String> capitalized=new ArrayList<>();
        asList().forEach(e->capitalized.add(e.toUpperCase())); // for each e it converts it to uppercase and adds it to the capitalized arraylist
        return capitalized;
    }

}
