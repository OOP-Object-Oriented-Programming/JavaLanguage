package com.codewithakiya.RealWorldProblem;

public class Bicycle implements Vehicle {

    int speed;
    int gear;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        this.speed -= decrement;
    }

    public void printStates(){
        System.out.println("Speed: " +
                speed + " gear: " + gear);
    }
}
