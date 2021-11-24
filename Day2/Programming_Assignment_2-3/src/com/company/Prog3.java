package com.company;

public class Prog3 {

    public static void main(String[] args) {
	    float num1=1.27F;
        float num2=3.881F;
        float num3=9.6F;
        float sum=num1+num2+num3;

        //For question 1
        int output1=(int)(sum);
        System.out.println(output1);

        //For question 2
        int output2=(Math.round(sum));
        System.out.println(output2);
    }
}
