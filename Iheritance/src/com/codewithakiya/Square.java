package com.codewithakiya;

public class Square extends Shape {

    public Square(double side){
        super(side, side);
    }

    @Override
    final public double area(){
        return this.getHeight() * this.getWidth();
    }
}
