package com.codewithakiya;

public class Bank<T,U> {
    private T name;
    private U employee;

    public Bank(T name, U employee){
        this.name = name;
        this.employee = employee;
    }

    public T getName(){
        return name;
    }

    public U getEmployee(){
        return employee;
    }
}
