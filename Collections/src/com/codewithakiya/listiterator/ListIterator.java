package com.codewithakiya.listiterator;

import java.util.ArrayList;

public class ListIterator {
    public static void main(String[] args) {
        var arr = new ArrayList<Integer>();
        for(int i=0; i<10; i++)
            arr.add(i);
        java.util.ListIterator itr = arr.listIterator();

        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
