package com.company;

import java.util.Scanner;

public class Prog4 {

    public static String isPrime(int n) {
        if (n < 2) return "Not Prime";
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return "Not Prime";
            }
        }
        return "Prime";
    }

    public static void main(String[] args) {
        System.out.println("Please input a number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input > 0) {
            System.out.println(Prog4.isPrime(input));
            System.out.println("Please input a number");
            input = sc.nextInt();
        }
    }
}
