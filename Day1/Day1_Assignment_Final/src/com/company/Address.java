package com.company;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    public Address(String str, String cit, String st, String z) {
        street = str;
        city = cit;
        state = st;
        zip = z;
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
    /**
     * Provides a string representation of an address.
     * @return a string representation of an addresss
     */
    public String toString() {
        return street + ", " + city + ", "+ state + " " + zip;
    }
}
