package com.codewithakiya.objectmethods;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        var students = new HashMap<Integer, Student>();

        var student1 = new Student("Girma Teklemariam", 26);
        var student2 = new Student("Tadiyous Girma", 30);
        var student3 = new Student("Kaleabe Tadiyous", 29);
        var student4 = new Student("Memar Father", 30);
        var student5 = new Student("Amir Father", 25);

        students.put(student1.hashCode(), student1);
        students.put(student2.hashCode(), student2);
        students.put(student3.hashCode(), student3);
        students.put(student4.hashCode(), student4);
        students.put(student5.hashCode(), student5);

        System.out.println(students.get(student1.hashCode()));
    }
}
