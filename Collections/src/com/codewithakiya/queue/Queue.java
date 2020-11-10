package com.codewithakiya.queue;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Integer> integers = new LinkedList<>();
        for(int i=0; i<10; i++){
            integers.add(i);
        }

        Iterator<Integer> integerIterator = integers.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

        System.out.println(integers.poll());

        System.out.println(integers);
    }
}
