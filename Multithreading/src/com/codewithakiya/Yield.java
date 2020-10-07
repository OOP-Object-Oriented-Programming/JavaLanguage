package com.codewithakiya;

public class Yield {
    public static void main(String[] args) {
        ChildThread childObj = new ChildThread();
        childObj.start();

        for(int i=0; i<4; i++){
            Thread.yield();

            System.out.println(Thread.currentThread().getName() +
                    " in control ");
        }
    }
}
