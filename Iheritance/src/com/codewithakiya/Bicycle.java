package com.codewithakiya;

public class Bicycle {
    private int gear;
    private int speed;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBreak(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    @Override
    public String toString(){
        return ("Number of gears are " + gear +
                "\n" +
                "speed of bicycle is " + speed);
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }
}
