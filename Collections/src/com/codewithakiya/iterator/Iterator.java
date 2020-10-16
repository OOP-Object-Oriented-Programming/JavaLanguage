package com.codewithakiya.iterator;

import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {
        var arr = new ArrayList<Integer>();
        for(int i=0; i<10; i++)
            arr.add(i);
        java.util.Iterator itr = arr.iterator();
        while (itr.hasNext())
            System.out.print((Integer)itr.next() + " ");
    }
}
