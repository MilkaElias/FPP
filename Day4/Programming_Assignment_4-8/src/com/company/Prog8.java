package com.company;

public class Prog8 {


    static int min(int[] arrayOfInts){
        int minimum=arrayOfInts[0];
        for(int i=0;i<arrayOfInts.length;i++){
            if(arrayOfInts[i]<minimum) minimum=arrayOfInts[i];
        }
        return minimum;
    }


    public static void main(String[] args) {
        //int[] testInput={2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
	    //System.out.println(min(input));
    }
}
