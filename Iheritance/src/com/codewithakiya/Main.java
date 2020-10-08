package com.codewithakiya;

public class Main {

    public static void main(String[] args) {

        // Single inheritance
        System.out.println("Single inheritance demo");
        Bicycle bicycle = new MountainBike(4,100,4);
	    MountainBike mountainBike = new MountainBike(3,100,2);
        System.out.println(mountainBike.toString());
        System.out.println();

        // Multilevel inheritance
        System.out.println("Multilevel inheritance demo");
        MultiThree multiThree = new MultiThree();
        multiThree.displayMultiOne();
        multiThree.displayMultiTwo();
        multiThree.displayMultiThree();
        System.out.println();

        // Hierarchical inheritance
        System.out.println("Hierarchical inheritance demo");
        HierarchicalTwo hierarchicalTwo = new HierarchicalTwo();
        HierarchicalThree hierarchicalThree = new HierarchicalThree();
        hierarchicalTwo.displayHierarchicalTwo();
        hierarchicalThree.displayHierarchicalThree();
        System.out.println();

        // Multiple inheritance
        ImplementClass implementClass = new ImplementClass();
        implementClass.display();
        System.out.println();

        // Using final keyword in inheritance
        System.out.println("Using final keyword in inheritance ");
        Shape s1 = new Rectangle(12,30);
        Shape s2 = new Square(23);
        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println();

        // More restrictive access to a derived class method
        System.out.println("More restrictive access to a derived class method ");
        Derived d = new Derived();
        d.display();
        System.out.println();
    }
}
