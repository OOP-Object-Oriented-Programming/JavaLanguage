package com.codewithakiya.objectmethods;

public class Student {
    private static int Id;
    private String name;
    private int age;

    public Student(String name, int age){
        ++this.Id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student {Id:" + Id +  ", Name: " + name + ", Age: " + age + "} ";
    }

    @Override
    public int hashCode(){
        return Id;
    }
}
