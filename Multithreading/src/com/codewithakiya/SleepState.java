package com.codewithakiya;

public class SleepState implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName() +
                    " " + i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread obj1 = new Thread(new SleepState());
        obj1.start();
        Thread obj2 = new Thread(new SleepState());
        obj2.start();
    }
}
