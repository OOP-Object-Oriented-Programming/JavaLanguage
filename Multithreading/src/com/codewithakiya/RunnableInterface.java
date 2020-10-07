package com.codewithakiya;

public class RunnableInterface implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Runnable interface  " +
                    Thread.currentThread().getId() +
                    " called ");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
