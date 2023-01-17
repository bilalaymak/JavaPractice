package practices01.inheritance.carconstructor;

public class Accord extends Honda{
    public void sportdesign(){

        System.out.println("all accords are in made in sport design");
    }
    public Accord(){
        System.out.println("Accord class constructor 1");
    }
/*
    //constructors in inheritance
    what is the mean of super() method, it is go to parent class
         1) super() is used to call constructor from parent class
         2) super() is in the first line of every constructor body
         3) super() is invisible as default, if you want you can type it explicitly

         4) super() can be used with parameters like super(true), super("Hybrid"), super(2023)
            5) when a class has multiple constructors to select the constructor we need, we use super() with parameters
 */
}
