package com.codewithakiya.RealWorldProblem;

public class Main {
    public static void main(String[] args) {
        var v1 = new Bicycle();
        v1.changeGear(3);
        v1.speedUp(100);
        v1.printStates();

        var v2 = new Bike();
        v2.changeGear(4);
        v2.applyBrakes(5);
        v2.printStates();
    }
}
