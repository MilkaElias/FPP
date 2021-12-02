package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MyTable t = new MyTable();
        t.add('b', "Bella");
        t.add('j', "Jerusalem");
        t.add('m', "Milka");
        t.add('p',"Pommy");
        System.out.println(t);
        System.out.println(t.get('p'));
    }

}
