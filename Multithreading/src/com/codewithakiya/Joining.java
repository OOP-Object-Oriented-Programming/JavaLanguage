package com.codewithakiya;

public class Joining implements Runnable{

    @Override
    public void run() {
        try{
            System.out.println("Current thread called " +
                    Thread.currentThread().getName());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Joining());
        Thread t2 = new Thread(new Joining());
        Thread t3 = new Thread(new Joining());

        t1.start();
        try{
            System.out.println("Current thread called " +
                    Thread.currentThread().getName());
            t1.join();
        }
        catch (Exception ex){
            System.out.println(ex);
        }

        t2.start();
        try{
            System.out.println("Current thread called " +
                    Thread.currentThread().getName());
            t2.join();
        }
        catch (Exception ex){
            System.out.println(ex);
        }

        t3.start();
    }
}
