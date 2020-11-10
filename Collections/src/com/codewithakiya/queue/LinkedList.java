package com.codewithakiya.queue;

public class LinkedList {
    public static void main(String[] args) {
        java.util.Queue<String> stringQueue = new java.util.LinkedList<>();

        stringQueue.add("Ethiopia");
        stringQueue.add("Kenya");
        stringQueue.add("Sudan");
        stringQueue.add("Somali");
        stringQueue.add("Egypt");

        System.out.println(stringQueue);

        System.out.println(stringQueue.poll());

        System.out.println(stringQueue);
    }
}
