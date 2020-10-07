package com.codewithakiya;

public class SynchronizedSender extends Thread {

    private String msg;
    Sender sender;

    SynchronizedSender(String msg, Sender sender){
        this.msg = msg;
        this.sender = sender;
    }

    @Override
    public void run(){
        synchronized(sender){
            sender.send(msg);
        }
    }
}
