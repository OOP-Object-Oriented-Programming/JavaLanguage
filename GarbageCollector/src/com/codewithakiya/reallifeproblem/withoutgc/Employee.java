package com.codewithakiya.reallifeproblem.withoutgc;

public class Employee {
    private int Id = 0;
    private String name = "";
    private int age = 0;
    private static int nextId = 1;

    public Employee(String name, int age){
        this.Id = nextId++;
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println("Id: " + Id + "\n" +
                        "Name: " + name + "\n" +
                        "Age: " + age + "\n");
    }

    public void printNextId(){
        System.out.println("Next Id: " + nextId);
    }
}
