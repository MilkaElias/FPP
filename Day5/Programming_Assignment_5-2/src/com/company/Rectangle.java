package com.company;

public class Rectangle extends ClosedCurve {
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

}
