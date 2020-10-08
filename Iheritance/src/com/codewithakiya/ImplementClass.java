package com.codewithakiya;

public class ImplementClass implements InterfaceClassOne, InterfaceClassTwo {
    @Override
    public void display(){
        InterfaceClassOne.super.display();
        InterfaceClassTwo.super.display();
    }
}
