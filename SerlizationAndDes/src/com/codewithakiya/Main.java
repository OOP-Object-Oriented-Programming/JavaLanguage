package com.codewithakiya;

import java.io.*;

public class Main {

    public static void printEmployeeData(Emp emp){
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("a: " + emp.a);
        System.out.println("b: " + emp.b);
    }

    public static void main(String[] args) {

        Demo1 demo1 = new Demo1(1, "code with akiya");
        String fileName = "file.ser";

        // Serialization
        try{
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(demo1);
            out.close();
            file.close();

            System.out.println("Object has been serialized");
        }
        catch (IOException ex){
            System.out.println(ex);
        }

        Demo1 demo2 = null;
        try{
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            demo2 = (Demo1) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            System.out.println("a = " + demo2.a);
            System.out.println("b = " + demo2.b);
        }
        catch (IOException ex){
            System.out.println(ex);
        }
        catch (ClassNotFoundException ex){
            System.out.println("Class not found exception is caught");
        }

        System.out.println();

        System.out.println("Demo two which giving version number and update the variables " +
                "using static and transient key words");
        Emp emp = new Emp("Akiya", 23, 10, 20);
        String fileName2 = "akiya.txt";

        // Serialization
        try{
            FileOutputStream file = new FileOutputStream(fileName2);
            ObjectOutputStream obj = new ObjectOutputStream(file);

            obj.writeObject(emp);
            obj.close();
            file.close();

            System.out.println("Employee object has been serialized \n" +
                    " Data before Deserialization.");
            printEmployeeData(emp);
        }
        catch (IOException ex){
            System.out.println("IOException is caught");
        }

        emp = null;
        // Deserialization
        try{
            FileInputStream file = new FileInputStream(fileName2);
            ObjectInputStream in = new ObjectInputStream(file);
            emp = (Emp) in.readObject();

            in.close();
            file.close();
            System.out.println("Object has been deserialized \n" +
                    " Data after deserialization");
            printEmployeeData(emp);
        }
        catch (IOException ex){
            System.out.println(ex);
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }
    }
}
