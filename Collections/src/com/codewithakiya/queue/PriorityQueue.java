package com.codewithakiya.queue;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<String> strings = new java.util.PriorityQueue<>();
        strings.add("FPP");
        strings.add("MPP");
        strings.add("Algorithm");
        strings.add("WAP");
        strings.add("WAA");
        strings.add("EA");
        strings.add("ASD");

        System.out.println(strings);

        strings.remove("WAP");

        System.out.println(strings);
    }
}
