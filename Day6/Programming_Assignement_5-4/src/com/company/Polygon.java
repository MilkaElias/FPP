package com.company;
// For Programming Assignment 5-4
public interface Polygon {
    public int getNumberOfSides();
    //public double computePerimeter();
    public double[] getArrayOfSides();
    static double sum(double[] arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }

    default double computePerimeter(){
        return sum(getArrayOfSides());
    }

}
