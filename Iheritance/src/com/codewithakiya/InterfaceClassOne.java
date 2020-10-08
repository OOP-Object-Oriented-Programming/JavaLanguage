package com.codewithakiya;

public interface InterfaceClassOne {
    public default void display(){
        System.out.println("Default method called from interface class one");
    }
}
