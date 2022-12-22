package practices01.constructersmethodcallsstatickeywords;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

    //    Scanner input = new Scanner(System.in); // it is an object

        //create an object from "Car" class,
        // Class name + object name = new + constructer;
        Car audi =new Car();// constructor executes "Car constructor 1"
        //when we run the Car constructer (in the Runner Class)
        //1. Car constructor goes to the Car class
        //2. finds the constructer
        //3. what is the Car constructer doing is printing "Car constructor 1"

        Car bmw = new Car("BMW", "M5", 2022, 50000);//object
        //when we use parameters, java uses the second constructor
        //after we put "BMW", java changed "Toyota", and like the others

        //we can also create another object from the second constructor
        Car mercedes = new Car("Mercedes", "C300", 2023, 60500);

    }
}
