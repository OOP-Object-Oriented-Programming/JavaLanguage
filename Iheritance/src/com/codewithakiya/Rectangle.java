package com.codewithakiya;

public class Rectangle extends Shape {

    public Rectangle(double width, double heigth){
        super(width, heigth);
    }

    @Override
    final double area() {
        return this.getWidth() * this.getHeight();
    }
}
