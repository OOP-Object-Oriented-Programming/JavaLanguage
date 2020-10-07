package com.codewithakiya;

public class Priority implements Runnable{

    @Override
    public void run() {
//        try{
//            System.out.println("Priority thread called");
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
    }

    public static void main(String[] args) {

        Thread priorityThread1 = new Thread(new Priority());
        Thread priorityThread2 = new Thread(new Priority());
        Thread priorityThread3 = new Thread(new Priority());

        System.out.println("Before update the priority: " + priorityThread1.getName() +
                " " + priorityThread1.getPriority());
        System.out.println("Before update the priority: " + priorityThread2.getName() +
                " " + priorityThread1.getPriority());
        System.out.println("Before update the priority: " + priorityThread3.getName() +
                " " + priorityThread1.getPriority());

        // Update thread priority
        priorityThread1.setPriority(4);
        priorityThread2.setPriority(1);
        priorityThread3.setPriority(10);

        System.out.println("update the priority: " + priorityThread1.getName() +
                " " + priorityThread1.getPriority());
        System.out.println("update the priority: " + priorityThread2.getName() +
                " " + priorityThread2.getPriority());
        System.out.println("update the priority: " + priorityThread3.getName() +
                " " + priorityThread3.getPriority());

        // Main Thread
        System.out.println(Thread.currentThread().getName() +
                " " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getName() +
                " " + Thread.currentThread().getPriority());

        // Give the same number priority
        priorityThread1.setPriority(7);
        priorityThread2.setPriority(7);
        System.out.println("update the priority: " + priorityThread1.getName() +
                " " + priorityThread1.getPriority());
        System.out.println("update the priority: " + priorityThread2.getName() +
                " " + priorityThread2.getPriority());
    }
}
