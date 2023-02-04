package practices01.constructersmethodcallsstatickeywords.constructers;

import java.util.Objects;

public class Car {


    /*
    when you create a class you will use it to create an object most probably, Java knows it
    because of that when you create a class Java puts "constructor" in it automatically,
    its name is "Default Constructor"
    "Default constructor"s are invisible

    if you create your own constructor, Java deletes the "Default Constructor"
     */

    //how to create "constructor"
    // note : constructor name must match with the class name

    //What are the difference between "constructors" and "methods"
    //note 1: constructors do not have "return type" but methods have
    //note2 : constructor name must match with the class name but method name can be any name
    //note 3: constructors are used to create objects but methods are used to create some actions

    //note : if any class you want to use, is in the same package no need to import
    // but if the class is in the different package, you have to import it

    /*
    1) we create constructors
    2) we create objects from constructors
    3) we create methods from objects
     */


    String make = "Toyota";
    String model = "Prius";
    int year = 2020;
    int price = 20000;
    //constructor
    public Car(){
        System.out.println("Car constructor 1");
    }
    public Car(String make,String model,int year,int price){//these parameters
        // give us flexibility to use these values
        this.make = make; // "this" means "make" variable in this Class
        // and this method provide flexibility us to change "Toyota" to any "kind of car"
        // that is giving authorization user to change the value variable
        this.model = model;
        this.year = year;
        this.price = price;
    }
    //we don't have to use all the parameters in the same construct, we can use some parameters in the constructor
    public Car(String make,String model,int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


}





















