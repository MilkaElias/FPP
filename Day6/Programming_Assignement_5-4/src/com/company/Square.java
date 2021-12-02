package com.company;
// For Programming Assignment 5-4
public class Square extends ClosedCurve implements Polygon {
    private double side;

    public Square(double side){
        this.side = side;

    }

    @Override
    public double computeArea() {
        return side * side;
    }


    @Override
    public int getNumberOfSides() {
        return 4;
    }

    @Override
    public double[] getArrayOfSides() {
        double [] sides={side,side,side,side};
        return sides;
    }
}
