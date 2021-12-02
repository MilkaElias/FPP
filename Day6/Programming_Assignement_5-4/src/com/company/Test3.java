package com.company;

// For Programming Assignment 5-4
public class Test3 {

    public static void main(String[] args) {
        Polygon[] objects = {new Square(3),new Triangle(4,5,6),new Rectangle(3,4)};

        for(Polygon p : objects) {
            String className= p.getClass().getSimpleName();
            System.out.format("For this %s\n",className);
            System.out.format("\tPerimeter = %4.1f\n",p.computePerimeter());

        }

    }
}
