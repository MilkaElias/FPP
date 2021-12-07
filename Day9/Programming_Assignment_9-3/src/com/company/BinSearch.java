package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BinSearch {

    public static void main(String[] args) {
        System.out.println(search("Milk",'a'));
    }

    public static boolean search(String s, char c){
        if(s.length()==0||s==null||(s.length()==1&&s.charAt(0) !=c)) return false;
        int m=s.length()/2;
        char ch=s.charAt(m);
        if(ch==c) return true;
        return c>ch?search(s.substring(m), c):search(s.substring(0,m),c);

    }



}




