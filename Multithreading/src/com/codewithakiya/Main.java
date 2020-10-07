package com.codewithakiya;

public class Main {

    public static void main(String[] args) {

        // Create thread by concrete class which is thread
        MultiThreading obj = new MultiThreading();
	    obj.start();
        System.out.println(obj.getState());

        // Create thread by interface class which is runnable
	    for(int i=0; i<5; i++){
            Thread runObj = new Thread(new RunnableInterface());
	        runObj.start();
//            System.out.println(runObj.getState());
        }
        // Synchronized demo
        System.out.println("Synchronized Demo");
        Sender sender = new Sender();
        SynchronizedSender synchronizedSender = new SynchronizedSender("Hello there", sender);
        SynchronizedSender synchronizedSender1 = new SynchronizedSender(" Bye there", sender);
        synchronizedSender.start();
        synchronizedSender1.start();
        try{
                synchronizedSender.join();
                synchronizedSender1.join();
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
}
