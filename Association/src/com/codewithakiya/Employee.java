package com.codewithakiya;

public class Employee<T> {
    private T name;

    public Employee(T name){
        this.name = name;
    }

    public T getName(){
        return name;
    }
}
