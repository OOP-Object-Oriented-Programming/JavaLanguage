package com.codewithakiya.collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class AbstractionCollections {
    public static void main(String[] args) {
        java.util.AbstractCollection<Integer> abs1 = new ArrayList<>();
        abs1.add(10);
        abs1.add(20);
        abs1.add(30);
        abs1.add(40);
        abs1.add(50);
        abs1.add(60);
        System.out.println(abs1);

        java.util.AbstractCollection<String> abs2 = new TreeSet<>();
        abs2.add("Cherente");
        abs2.add("Moges");
        abs2.add("Manaye");
        abs2.add("Abiy");
        abs2.add("Abeba");
        abs2.add("Nestanet");
        System.out.println(abs2);

        java.util.AbstractCollection<String> abs3 = new TreeSet<>();
        abs3.addAll(abs2);
        System.out.println(abs3);
    }
}
