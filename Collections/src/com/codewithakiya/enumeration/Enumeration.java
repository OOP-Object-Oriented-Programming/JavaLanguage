package com.codewithakiya.enumeration;

import java.util.*;

public class Enumeration {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i=0; i<10; i++)
            v.add(i);
        System.out.println(v);

        java.util.Enumeration e = v.elements();
        while(e.hasMoreElements())
            System.out.print((Integer)e.nextElement() + " ");
    }
}
