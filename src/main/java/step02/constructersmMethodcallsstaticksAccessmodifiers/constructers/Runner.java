package step02.constructersmMethodcallsstaticksAccessmodifiers.constructers;

public class Runner {
    public static void main(String[] args) {

    //    Scanner input = new Scanner(System.in); // it is an object

        //create an object from "Car" class,
        // Class name + object name = new + constructor;
        Car audi =new Car();// constructor executes "Car constructor 1"
        System.out.println(audi.make);//Toyota
        System.out.println(audi.model);//Prius

        //when we run the Car constructor (in the Runner Class)
        //1. Car constructor goes to the Car class
        //2. finds the constructor
        //3. what is the Car constructor doing is printing "Car constructor 1"

        Car bmw = new Car("BMW", "M5", 2022, 50000);//object
        //when we check the object is true or not, we type object name and plus "." ==> bmv.
        // we must see methods in the constructor
        System.out.println(bmw.make);//BMW
        System.out.println(bmw.model);//M5

        //when we use parameters, java uses the second constructor
        //after we put "BMW", java changed "Toyota", and like the others

        //we can also create another object from the second constructor
        Car mercedes = new Car("Mercedes", "C300", 2023, 60500);
        System.out.println(mercedes.make);//Mercedes
        System.out.println(mercedes.model);//C300

        //by using one constructor, we reach three objects and methods in the runner class

        Car itCar = new Car("Rolls Royce", "M500", 2023);
        System.out.println(itCar.make);//Rolls Royce
        System.out.println(itCar.model);//M500
        System.out.println(itCar.year);//2023

        Static01 obj1 = new Static01();
        Static01 obj2 = new Static01();
        Static01 obj3 = new Static01();

        System.out.println(obj3.nonStaticCounter);//1
        System.out.println(obj3.staticCounter);//3

    }
}



















