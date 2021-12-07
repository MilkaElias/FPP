package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(recursiveIsEven(5));
        System.out.println(recursiveIsEven(16));
        System.out.println(isEven(5));
        System.out.println(isEven(16));

    }

    //Using Recursion
    public static boolean recursiveIsEven(int n){
        if(n==1) return false;
        boolean ret=recursiveIsEven(n-1);
        return !ret;
    }

    //Without using recursion

    public static boolean isEven(int n){
        return n%2==0;
    }
}
