package com.codewithakiya;

public class Aggregation {

    public static void main(String[] args) {
        var employeeName = new Employee<>("Girma Teklemariam");
        var bank = new Bank<>("Bank of American", employeeName);


        System.out.println(bank.getEmployee().getName() + " is working in " + bank.getName());
    }
}
