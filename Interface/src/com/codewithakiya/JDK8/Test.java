package com.codewithakiya.JDK8;

public class Test implements Interface1 {
    public static void main(String[] args) {
        var test = new Test();
        test.display();
        Interface1.staticMethod();
    }
}
