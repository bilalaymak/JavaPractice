package practices01.constructersmethodcallsstatickeywords;

public class Car {


    /*
    when you create a class you will use it to create an object most probably, Java knows it
    because of that when you create a class Java puts "constructor" in it automatically,
    its name is "Default Constructor"
    "Default constructor"s are invisible

    if you create your own constructer, Java deletes the "Default Constructor"
     */

    //how to create "constructor"
    // note : constructor name must match with the class name

    //What are the difference between "constructors" and "methods"
    //note 1: constructors do not have "return type" but methods have
    //note2 : constructor name must match with the class name but method name can be any name
    //note 3: constructors are used to create objects but methods are used to create some actions

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
        // that is giving autorization user to change the value variable
        this.model = model;
        this.year = year;
        this.price = price;

    }









}





















