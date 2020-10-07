package com.codewithakiya;

public class Sender {
    public void send(String msg){
        System.out.println("Sending\t" + msg);
        try{
            Thread.sleep(1000);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        System.out.println("Sent");
    }
}
