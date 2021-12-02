package com.company;

public class Square extends ClosedCurve {
    private double side;

    public Square(double side){
        this.side = side;

    }

    @Override
    public double computeArea() {
        return side * side;
    }

}
