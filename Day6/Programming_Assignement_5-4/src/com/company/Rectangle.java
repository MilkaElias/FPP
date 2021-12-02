package com.company;

// For Programming Assignment 5-4
public class Rectangle extends ClosedCurve implements Polygon {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }

    @Override
    public double computeArea(){
        return width*length;
    }

    @Override
    public int getNumberOfSides() {
        return 4;
    }


    @Override
    public double[] getArrayOfSides() {
        double [] sides={width,length,width,length};
        return sides;
    }
}
