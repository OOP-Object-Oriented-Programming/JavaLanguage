package com.codewithakiya.convertion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Converted con = new Converted();
        Iterable<Integer> itr = Arrays.asList(12,34,56,78,90);
        Collection<Integer> col = con.getCollection(itr, new ArrayList<Integer>());
        System.out.println(col);
    }


}
