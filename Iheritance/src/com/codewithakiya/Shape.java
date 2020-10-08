package com.codewithakiya;

public abstract class Shape {
    private double width;
    private double height;

    public Shape (double width, double height){
        this.width = width;
        this.height = height;
    }

    public final double getWidth(){
        return width;
    }

    public final double getHeight(){
        return height;
    }

    abstract double area();
}
