package com.company;
import java.util.Scanner;

public class Prog5 {
    public static void reverseString(String word){
        for(int i=word.length()-1; i>=0;i--){
            System.out.print(word.charAt(i));
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter input: ");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        reverseString(input);
        
    }
}
