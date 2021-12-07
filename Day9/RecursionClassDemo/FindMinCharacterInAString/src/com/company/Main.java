package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println(findMinChar("hello"));
        System.out.println(iterativeFindMinChar("hello"));
    }

    //Using Recursion
    public static char findMinChar(String s){
        if(s.length()==1) return s.charAt(0);
        char ret=findMinChar(s.substring(1));
        char zeroTh=s.charAt(0);
        return ret<zeroTh?ret:zeroTh;
    }

    //Using Iterative way
    public static char iterativeFindMinChar(String s){
        char min= s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)<min) min=s.charAt(i);
        }
        return min;
    }
}

