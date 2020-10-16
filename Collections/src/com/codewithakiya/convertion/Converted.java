package com.codewithakiya.convertion;

import java.util.*;

public class Converted {

    public <T> Collection<T> getCollection(Iterable<T> itr, ArrayList<T> arr){
         Collection<T> colt = arr;
         for(T item : itr)
             colt.add(item);
         return colt;
    }

    public <T> Collection<T> getCollection(Iterable<T> iterable, LinkedList<T> lin){
        Collection<T> col = lin;
        Iterator<T> itr = iterable.iterator();
        while(itr.hasNext()){
            col.add(itr.next());
        }
        return col;
    }

    public <T> Collection<T> getCollection(Iterable<T> iterable, Vector<T> vec){
        Collection<T> col = vec;
        iterable.forEach(col :: add);
        return col;
    }
 }
