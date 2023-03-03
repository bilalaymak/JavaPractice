package oopgokhanrepo.day29interfacemanipulations;

public interface Vehicle {

    public default void move() { // to make a method in an interface we can use concrete methods by using default
        System.out.println("All vehicles should move.. "); // and static keywords
    }


    public static void staticMove() {
        System.out.println("All vehicles should move better..");
    }



}
