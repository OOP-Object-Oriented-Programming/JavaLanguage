package com.codewithakiya.reallifeproblem.withoutgc;

public class Test {
    public static void main(String[] args) {
        var emp1 = new Employee("Jerry", 23);
        var emp2 = new Employee("Kitty", 21);
        var emp3 = new Employee("Mark", 36);
        emp1.print();
        emp2.print();
        emp3.print();
        emp1.printNextId();
        emp2.printNextId();
        emp3.printNextId();

        {
            var x = new Employee("Mr.x",36);
            var y = new Employee("Mr.y",46);
            x.print();
            y.print();
            x.printNextId();
            y.printNextId();
        }
        emp1.printNextId();
    }
}
