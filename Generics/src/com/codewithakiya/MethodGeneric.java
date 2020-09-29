package com.codewithakiya;

public class MethodGeneric {
    static<T> void display(T item){
        System.out.println(item.getClass().getName() + " " + item);
    }
}
