package com.codewithakiya;

public class Emp implements java.io.Serializable{
    private static final long serialversionUID = 129348938L;
    transient int a;
    static int b;
    String name;
    int age;

    public Emp(String name, int age, int a, int b){
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }
}
