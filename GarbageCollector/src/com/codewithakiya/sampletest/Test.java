package com.codewithakiya.sampletest;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        var test1 = new Test();
        var test2 = new Test();

        test1 = null;
        System.gc();

        test2 = null;
        Runtime.getRuntime().gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called");
        System.out.println("Object collector called " + this);
    }
}
