package com.codewithakiya;

public class MultiThreading extends Thread {

    @Override
    public void run(){
        try {
            System.out.println("Thread " +
                    Thread.currentThread().getId() + ", " +
                    Thread.currentThread().getName() +
                    " is running ");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
