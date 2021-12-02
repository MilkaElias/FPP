package com.company;
// For Programming Assignment 5-3
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
    public double computePerimeter(){
        return side*getNumberOfSides();
    }

    @Override
    public int getNumberOfSides() {
        return 4;
    }
}
