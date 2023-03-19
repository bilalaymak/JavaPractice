package step02.inheritance.carconstructor;

public class Civic extends Honda{
    public void ecoEngine(){
        System.out.println("Civic uses eco engine");
    }
    public Civic(){//default constructor
        System.out.println("Civic class constructor 1");
    }
    public Civic(int year){//our constructor, not default,
        // when we create our constructor, java deletes the default one
        super(true);
        System.out.println(year);
    }

      /*
    //constructors in inheritance
    what is the mean of super() method, it is to go to parent class
         1) super() is used to call constructor from parent class
         2) super() is in the first line of every constructor body
         3) super() is invisible as default, if you want you can type it explicitly
         4) super() can be used with parameters like super(true), super("Hybrid"), super(2023)
         5) when a class has multiple constructors to select the constructor we need, we use super() with parameters
 */


}
