package com.codewithakiya;

public class MainThread extends Thread {

    public static void main(String[] args) {
        Thread obj = Thread.currentThread();

        System.out.println("Current Name: " + obj.getName());
        obj.setName("Akiya");
        System.out.println("Update Name: " + obj.getName());
        System.out.println("Main thread priority: " + obj.getPriority());
        obj.setPriority(MAX_PRIORITY);
        System.out.println("Update thread priority: " + obj.getPriority());

        ChildThread childObj = new ChildThread();
        childObj.start();
    }

}

class ChildThread extends Thread {
    @Override
    public void run(){
        System.out.println("Child thread called");
    }
}
