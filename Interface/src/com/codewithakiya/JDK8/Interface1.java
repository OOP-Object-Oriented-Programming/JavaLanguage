package com.codewithakiya.JDK8;

public interface Interface1 {
    int a = 10;

    default void display(){
        System.out.println("Default method called");
    }

    static void staticMethod(){
        System.out.println("Static method called");
    }
}
