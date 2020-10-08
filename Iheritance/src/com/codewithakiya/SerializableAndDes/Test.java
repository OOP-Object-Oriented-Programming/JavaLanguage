package com.codewithakiya.SerializableAndDes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws Exception{
        Derived derived = new Derived(3,4);
        System.out.println("i = " + derived.i);
        System.out.println("j = " + derived.j);

        FileOutputStream out = new FileOutputStream("file.text");
        ObjectOutputStream obj = new ObjectOutputStream(out);

        obj.writeObject(derived);
        obj.close();
        out.close();

        System.out.println("Object has been serialized");

        FileInputStream input = new FileInputStream("file.text");
        ObjectInputStream objInput = new ObjectInputStream(input);
        Derived derived1 = (Derived) objInput.readObject();
        objInput.close();
        input.close();

        System.out.println("Object has been deserialized");
        System.out.println("i = " + derived1.i);
        System.out.println("j = " + derived1.j);
    }
}
