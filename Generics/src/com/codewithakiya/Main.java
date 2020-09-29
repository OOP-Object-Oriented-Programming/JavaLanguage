package com.codewithakiya;

public class Main {

    public static void main(String[] args) {

        // Generic by class scope
        var generic1 = new ClassGeneric<Integer>(23);
        System.out.println(generic1.getClass().getName() + " " + generic1.getObj());
        var generic2 = new ClassGeneric<>("Code with akiya");
        System.out.println(generic2.getClass().getName() + " " + generic2.getObj());

        // Break line
        System.out.println();

        // Generic by method scope
        MethodGeneric.display(23);
        MethodGeneric.display("Code with akiya");
    }
}
