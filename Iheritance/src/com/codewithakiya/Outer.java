package com.codewithakiya;

public class Outer {
    private void display(){
        System.out.println("Outer class called");
    }

    class Inner extends Outer{
        private void display(){
            System.out.println("Inner class called");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.display();

        outer = inner;
        outer.display();
    }
}
